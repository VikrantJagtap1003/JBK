package August_29.ProjectManagement;

public class Member {
    private int memberId;
    private int memberName;

    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", memberName=" + memberName +
                '}';
    }

    public Member(int memberId, int memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberName() {
        return memberName;
    }

    public void setMemberName(int memberName) {
        this.memberName = memberName;
    }
    public Member()
    {

    }
}
