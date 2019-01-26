package org.daming.person.utils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

public class JwtUtil {


    public String createJWT(String id, String subject, long ttlMillis, SecretKey secretKey, Map<String, Object> claims) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        JwtBuilder builder = Jwts.builder();
        if (Objects.nonNull(claims) && !claims.isEmpty()) {
            builder.setClaims(claims);
        }
        builder.setId(id).setIssuedAt(now).setSubject(subject).signWith(signatureAlgorithm, secretKey);
        if (ttlMillis >= 0L) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }
        return builder.compact();
    }

    public Claims parseJwt(String jwt, SecretKey secretKey) {
        Claims claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwt).getBody();
        return claims;
    }


    public SecretKey generalKey(String key) {
        byte[] encodeKey = Base64.decodeBase64(key);
        SecretKey secretKey = new SecretKeySpec(encodeKey, 0, encodeKey.length, "AES");
        return secretKey;
    }
}
