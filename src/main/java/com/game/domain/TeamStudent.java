package com.game.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName team_student
*/
public class TeamStudent implements Serializable {

    /**
    * 队伍id
    */
    @NotNull(message="[队伍id]不能为空")
    @ApiModelProperty("队伍id")
    private Integer tId;
    /**
    * 学生成员id
    */
    @NotNull(message="[学生成员id]不能为空")
    @ApiModelProperty("学生成员id")
    private Integer sId;

    /**
    * 队伍id
    */
    private void setTId(Integer tId){
    this.tId = tId;
    }

    /**
    * 学生成员id
    */
    private void setSId(Integer sId){
    this.sId = sId;
    }


    /**
    * 队伍id
    */
    private Integer getTId(){
    return this.tId;
    }

    /**
    * 学生成员id
    */
    private Integer getSId(){
    return this.sId;
    }

}
