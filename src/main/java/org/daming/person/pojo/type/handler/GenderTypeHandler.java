package org.daming.person.pojo.type.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.daming.person.enums.Gender;
import org.springframework.util.StringUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.EnumMap;
import java.util.Map;

@MappedJdbcTypes({JdbcType.VARCHAR})
@MappedTypes({Gender.class})
public class GenderTypeHandler extends BaseTypeHandler<Gender> {

    private EnumMap<Gender, String> map;

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Gender gender, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(1, map.get(gender));
    }

    @Override
    public Gender getNullableResult(ResultSet rs, String s) throws SQLException {
        String value = rs.getString(s);
        return this.getGender(value);
    }

    @Override
    public Gender getNullableResult(ResultSet rs, int i) throws SQLException {
        String value = rs.getString(i);
        return this.getGender(value);
    }

    @Override
    public Gender getNullableResult(CallableStatement cs, int i) throws SQLException {
        String value = cs.getString(i);
        return this.getGender(value);
    }

    private Gender getGender(String value) {
        return this.map.entrySet().stream()
                .filter(e -> value.equalsIgnoreCase(e.getValue()))
                .map(Map.Entry::getKey).findFirst().orElse(Gender.N);
    }

    public GenderTypeHandler() {
        super();
        this.init();
    }

    private void init() {
        this.map = new EnumMap<>(Gender.class);
        this.map.put(Gender.F, "F");
        this.map.put(Gender.M, "M");
        this.map.put(Gender.N, "N");
    }
}
