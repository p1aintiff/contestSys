package com.game.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName team_mentor
*/
public class TeamMentor implements Serializable {

    /**
    * 队伍id
    */
    @NotNull(message="[队伍id]不能为空")
    @ApiModelProperty("队伍id")
    private Integer tId;
    /**
    * 导师id
    */
    @NotNull(message="[导师id]不能为空")
    @ApiModelProperty("导师id")
    private Integer mId;

    /**
    * 队伍id
    */
    private void setTId(Integer tId){
    this.tId = tId;
    }

    /**
    * 导师id
    */
    private void setMId(Integer mId){
    this.mId = mId;
    }


    /**
    * 队伍id
    */
    private Integer getTId(){
    return this.tId;
    }

    /**
    * 导师id
    */
    private Integer getMId(){
    return this.mId;
    }

}
