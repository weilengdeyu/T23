package cn.happy.entity;

/**
 * @Classname Result
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/4/3 10:52
 * @Created by Happy-微冷的雨
 */
public class Result {
    private Integer rid;
    private Integer sid;
    private Integer score;

    @Override
    public String toString() {
        return "Result{" +
                "rid=" + rid +
                ", sid=" + sid +
                ", score=" + score +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
