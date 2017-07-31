package com.domain.cm.quartz;

/**
 * 定时任务查询条件
 *
 * @author YangQing
 * @version 1.0.0
 */
public class QrtzCronTriggersCondition {

    //任务名称
    private String schedName;

    //触发器名称
    private String triggerName;

    //触发器分组
    private String triggerGroup;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    @Override
    public String toString() {
        return "QrtzCronTriggers{" +
                ", schedName='" + schedName + '\'' +
                ", triggerName='" + triggerName + '\'' +
                ", triggerGroup='" + triggerGroup + '\'' +
                ", id=" + id +
                '}';
    }
}