package com.itheima.entity;

public class Account {

    private Integer accountId;
    private Integer uid;
    private Double money;
    private Double pi;

    public Account(Integer accountId, Integer uid, Double money, Double pi) {
        this.accountId = accountId;
        this.uid = uid;
        this.money = money;
        this.pi = pi;
    }

    public Account() {
    }

    public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", uid=" + uid +
                ", money=" + money +
                ", pi=" + pi +
                '}';
    }

    /**
     * 获取
     * @return accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * 设置
     * @param accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取
     * @return money
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(Double money) {
        this.money = money;
    }

}
