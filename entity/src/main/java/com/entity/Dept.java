package com.entity;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

public class Dept {

    /**
     * @Max(value = 20,message = "要xiaoyu等于20")
     * @DecimalMin(value ="30",message = "必须大于等于30")
     * @Size(min = 4,max = 8,message = "长度只能在四位到八位之间")//@Size：包含4位和8位
     * @NotEmpty
     * @NotBlank(message = "不能是空白")//可以用在String上面
     */


    @NotNull(message = "id不能为空")
//    @NotNull(message = "id必须为空")
    @Min(value = 20,message = "id要大于等于20")
    private Integer id;

    @NotNull(message = "aFloat不能为空")
//    @NotNull(message = "aFloat必须为空")
    @Min(value = 20,message = "aFloat要大于等于20")
    private Float aFloat;

    @NotNull(message = "aDouble不能为空")
//    @NotNull(message = "aDouble必须为空")
    @Min(value = 20,message = "aDouble要大于等于20")
    private Double aDouble;

    @NotNull(message = "bigDecimal不能为空")
//    @NotNull(message = "bigDecimal必须为空")
    @Min(value = 20,message = "bigDecimal要大于等于20")
    private BigDecimal bigDecimal;

//    @NotNull(message = "name不能为空")
//    @NotNull(message = "name必须为空")
    private String name;

//    @NotNull(message = "开始日期不能为空")
//    @NotNull(message = "开始日期必须为空")
    @DateTimeFormat
    private Date startDate;

//    @NotNull(message = "结束日期不能为空")
//    @NotNull(message = "结束日期必须为空")
    @DateTimeFormat
    private Date endDate;

//    @NotNull(message = "email不能为空")
//    @NotNull(message = "email必须为空")
    private String email;

//    @NotNull(message = "判断不能为空")
//    @NotNull(message = "判断必须为空")
//    @AssertTrue(message = "判断必须为true")
    private Boolean yn;
























    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", aFloat=" + aFloat +
                ", aDouble=" + aDouble +
                ", bigDecimal=" + bigDecimal +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", email='" + email + '\'' +
                ", yn=" + yn +
                '}';
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean isYn() {
        return yn;
    }

    public void setYn(Boolean yn) {
        this.yn = yn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getaFloat() {
        return aFloat;
    }

    public void setaFloat(Float aFloat) {
        this.aFloat = aFloat;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }
}
