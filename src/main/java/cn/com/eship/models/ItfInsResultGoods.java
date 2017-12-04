package cn.com.eship.models;

public class ItfInsResultGoods {
    private  long rmb;
    private  long bjpc;
    private  long qysm;
    private  String dm;
    private  String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm;
    }

    public long getRmb() {
        return rmb;
    }

    public void setRmb(long rmb) {
        this.rmb = rmb;
    }

    public long getBjpc() {
        return bjpc;
    }

    public void setBjpc(long bjpc) {
        this.bjpc = bjpc;
    }

    public long getQysm() {
        return qysm;
    }

    public void setQysm(long qysm) {
        this.qysm = qysm;
    }
}
