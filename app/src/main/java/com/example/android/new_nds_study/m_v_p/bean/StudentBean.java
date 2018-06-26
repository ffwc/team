package com.example.android.new_nds_study.m_v_p.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dell on 2018/6/24.
 */

public class StudentBean implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentBean)) return false;

        StudentBean that = (StudentBean) o;

        if (getId() != that.getId()) return false;
        if (getPoints_possible() != that.getPoints_possible()) return false;
        if (getAssignment_group_id() != that.getAssignment_group_id()) return false;
        if (isPeer_reviews() != that.isPeer_reviews()) return false;
        if (isAutomatic_peer_reviews() != that.isAutomatic_peer_reviews()) return false;
        if (getPosition() != that.getPosition()) return false;
        if (isGrade_group_students_individually() != that.isGrade_group_students_individually())
            return false;
        if (isAnonymous_peer_reviews() != that.isAnonymous_peer_reviews()) return false;
        if (isPost_to_sis() != that.isPost_to_sis()) return false;
        if (isModerated_grading() != that.isModerated_grading()) return false;
        if (isOmit_from_final_grade() != that.isOmit_from_final_grade()) return false;
        if (isIntra_group_peer_reviews() != that.isIntra_group_peer_reviews()) return false;
        if (isAnonymous_instructor_annotations() != that.isAnonymous_instructor_annotations())
            return false;
        if (getCourse_id() != that.getCourse_id()) return false;
        if (isHas_submitted_submissions() != that.isHas_submitted_submissions()) return false;
        if (isDue_date_required() != that.isDue_date_required()) return false;
        if (getMax_name_length() != that.getMax_name_length()) return false;
        if (isIn_closed_grading_period() != that.isIn_closed_grading_period()) return false;
        if (isIs_quiz_assignment() != that.isIs_quiz_assignment()) return false;
        if (isMuted() != that.isMuted()) return false;
        if (getQuiz_id() != that.getQuiz_id()) return false;
        if (isAnonymous_submissions() != that.isAnonymous_submissions()) return false;
        if (isPublished() != that.isPublished()) return false;
        if (isOnly_visible_to_overrides() != that.isOnly_visible_to_overrides()) return false;
        if (isLocked_for_user() != that.isLocked_for_user()) return false;
        if (!getDescription().equals(that.getDescription())) return false;
        if (!getDue_at().equals(that.getDue_at())) return false;
        if (!getUnlock_at().equals(that.getUnlock_at())) return false;
        if (!getLock_at().equals(that.getLock_at())) return false;
        if (!getGrading_type().equals(that.getGrading_type())) return false;
        if (!getGrading_standard_id().equals(that.getGrading_standard_id())) return false;
        if (!getCreated_at().equals(that.getCreated_at())) return false;
        if (!getUpdated_at().equals(that.getUpdated_at())) return false;
        if (!getGroup_category_id().equals(that.getGroup_category_id())) return false;
        if (!getSecure_params().equals(that.getSecure_params())) return false;
        if (!getName().equals(that.getName())) return false;
        if (!getHtml_url().equals(that.getHtml_url())) return false;
        if (!getSubmissions_download_url().equals(that.getSubmissions_download_url())) return false;
        if (!getLock_info().equals(that.getLock_info())) return false;
        if (!getLock_explanation().equals(that.getLock_explanation())) return false;
        return getSubmission_types().equals(that.getSubmission_types());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getDescription().hashCode();
        result = 31 * result + getDue_at().hashCode();
        result = 31 * result + getUnlock_at().hashCode();
        result = 31 * result + getLock_at().hashCode();
        result = 31 * result + getPoints_possible();
        result = 31 * result + getGrading_type().hashCode();
        result = 31 * result + getAssignment_group_id();
        result = 31 * result + getGrading_standard_id().hashCode();
        result = 31 * result + getCreated_at().hashCode();
        result = 31 * result + getUpdated_at().hashCode();
        result = 31 * result + (isPeer_reviews() ? 1 : 0);
        result = 31 * result + (isAutomatic_peer_reviews() ? 1 : 0);
        result = 31 * result + getPosition();
        result = 31 * result + (isGrade_group_students_individually() ? 1 : 0);
        result = 31 * result + (isAnonymous_peer_reviews() ? 1 : 0);
        result = 31 * result + getGroup_category_id().hashCode();
        result = 31 * result + (isPost_to_sis() ? 1 : 0);
        result = 31 * result + (isModerated_grading() ? 1 : 0);
        result = 31 * result + (isOmit_from_final_grade() ? 1 : 0);
        result = 31 * result + (isIntra_group_peer_reviews() ? 1 : 0);
        result = 31 * result + (isAnonymous_instructor_annotations() ? 1 : 0);
        result = 31 * result + getSecure_params().hashCode();
        result = 31 * result + getCourse_id();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (isHas_submitted_submissions() ? 1 : 0);
        result = 31 * result + (isDue_date_required() ? 1 : 0);
        result = 31 * result + getMax_name_length();
        result = 31 * result + (isIn_closed_grading_period() ? 1 : 0);
        result = 31 * result + (isIs_quiz_assignment() ? 1 : 0);
        result = 31 * result + (isMuted() ? 1 : 0);
        result = 31 * result + getHtml_url().hashCode();
        result = 31 * result + getQuiz_id();
        result = 31 * result + (isAnonymous_submissions() ? 1 : 0);
        result = 31 * result + (isPublished() ? 1 : 0);
        result = 31 * result + (isOnly_visible_to_overrides() ? 1 : 0);
        result = 31 * result + (isLocked_for_user() ? 1 : 0);
        result = 31 * result + getSubmissions_download_url().hashCode();
        result = 31 * result + getLock_info().hashCode();
        result = 31 * result + getLock_explanation().hashCode();
        result = 31 * result + getSubmission_types().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", due_at=" + due_at +
                ", unlock_at=" + unlock_at +
                ", lock_at=" + lock_at +
                ", points_possible=" + points_possible +
                ", grading_type='" + grading_type + '\'' +
                ", assignment_group_id=" + assignment_group_id +
                ", grading_standard_id=" + grading_standard_id +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", peer_reviews=" + peer_reviews +
                ", automatic_peer_reviews=" + automatic_peer_reviews +
                ", position=" + position +
                ", grade_group_students_individually=" + grade_group_students_individually +
                ", anonymous_peer_reviews=" + anonymous_peer_reviews +
                ", group_category_id=" + group_category_id +
                ", post_to_sis=" + post_to_sis +
                ", moderated_grading=" + moderated_grading +
                ", omit_from_final_grade=" + omit_from_final_grade +
                ", intra_group_peer_reviews=" + intra_group_peer_reviews +
                ", anonymous_instructor_annotations=" + anonymous_instructor_annotations +
                ", secure_params='" + secure_params + '\'' +
                ", course_id=" + course_id +
                ", name='" + name + '\'' +
                ", has_submitted_submissions=" + has_submitted_submissions +
                ", due_date_required=" + due_date_required +
                ", max_name_length=" + max_name_length +
                ", in_closed_grading_period=" + in_closed_grading_period +
                ", is_quiz_assignment=" + is_quiz_assignment +
                ", muted=" + muted +
                ", html_url='" + html_url + '\'' +
                ", quiz_id=" + quiz_id +
                ", anonymous_submissions=" + anonymous_submissions +
                ", published=" + published +
                ", only_visible_to_overrides=" + only_visible_to_overrides +
                ", locked_for_user=" + locked_for_user +
                ", submissions_download_url='" + submissions_download_url + '\'' +
                ", lock_info=" + lock_info +
                ", lock_explanation='" + lock_explanation + '\'' +
                ", submission_types=" + submission_types +
                '}';
    }

    /**
     * id : 77
     * description :
     * due_at : null
     * unlock_at : null
     * lock_at : null
     * points_possible : 4
     * grading_type : points
     * assignment_group_id : 123
     * grading_standard_id : null
     * created_at : 2018-06-13T02:51:51Z
     * updated_at : 2018-06-13T02:53:52Z
     * peer_reviews : false
     * automatic_peer_reviews : false
     * position : 1
     * grade_group_students_individually : false
     * anonymous_peer_reviews : false
     * group_category_id : null
     * post_to_sis : false
     * moderated_grading : false
     * omit_from_final_grade : false
     * intra_group_peer_reviews : false
     * anonymous_instructor_annotations : false
     * secure_params : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsdGlfYXNzaWdubWVudF9pZCI6IjZjMjM2MTZmLWJjYjMtNDIyNS1hMTRmLTdmYmU2MDI5NDkyMCJ9.CKAf0mA_h1QaM_Z-USiDbqugNRiaFrCivX8E5GIAgko
     * course_id : 121
     * name : 行政能力测验
     * submission_types : ["online_quiz"]
     * has_submitted_submissions : false
     * due_date_required : false
     * max_name_length : 255
     * in_closed_grading_period : false
     * is_quiz_assignment : true
     * muted : false
     * html_url : https://api.canvas.com/courses/121/assignments/77
     * quiz_id : 90
     * anonymous_submissions : false
     * published : true
     * only_visible_to_overrides : false
     * locked_for_user : false
     * submissions_download_url : https://api.canvas.com/courses/121/quizzes/90/submissions?zip=1
     * lock_info : {"asset_string":"assignment_89","lock_at":"2018-06-23T15:59:00Z","can_view":true}
     * lock_explanation : 此作业锁定于 6月 23 23:59。
     */

    private int id;
    private String description;
    private Object due_at;
    private Object unlock_at;
    private Object lock_at;
    private int points_possible;
    private String grading_type;
    private int assignment_group_id;
    private Object grading_standard_id;
    private String created_at;
    private String updated_at;
    private boolean peer_reviews;
    private boolean automatic_peer_reviews;
    private int position;
    private boolean grade_group_students_individually;
    private boolean anonymous_peer_reviews;
    private Object group_category_id;
    private boolean post_to_sis;
    private boolean moderated_grading;
    private boolean omit_from_final_grade;
    private boolean intra_group_peer_reviews;
    private boolean anonymous_instructor_annotations;
    private String secure_params;
    private int course_id;
    private String name;
    private boolean has_submitted_submissions;
    private boolean due_date_required;
    private int max_name_length;
    private boolean in_closed_grading_period;
    private boolean is_quiz_assignment;
    private boolean muted;
    private String html_url;
    private int quiz_id;
    private boolean anonymous_submissions;
    private boolean published;
    private boolean only_visible_to_overrides;
    private boolean locked_for_user;
    private String submissions_download_url;
    private LockInfoBean lock_info;
    private String lock_explanation;
    private List<String> submission_types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getDue_at() {
        return due_at;
    }

    public void setDue_at(Object due_at) {
        this.due_at = due_at;
    }

    public Object getUnlock_at() {
        return unlock_at;
    }

    public void setUnlock_at(Object unlock_at) {
        this.unlock_at = unlock_at;
    }

    public Object getLock_at() {
        return lock_at;
    }

    public void setLock_at(Object lock_at) {
        this.lock_at = lock_at;
    }

    public int getPoints_possible() {
        return points_possible;
    }

    public void setPoints_possible(int points_possible) {
        this.points_possible = points_possible;
    }

    public String getGrading_type() {
        return grading_type;
    }

    public void setGrading_type(String grading_type) {
        this.grading_type = grading_type;
    }

    public int getAssignment_group_id() {
        return assignment_group_id;
    }

    public void setAssignment_group_id(int assignment_group_id) {
        this.assignment_group_id = assignment_group_id;
    }

    public Object getGrading_standard_id() {
        return grading_standard_id;
    }

    public void setGrading_standard_id(Object grading_standard_id) {
        this.grading_standard_id = grading_standard_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isPeer_reviews() {
        return peer_reviews;
    }

    public void setPeer_reviews(boolean peer_reviews) {
        this.peer_reviews = peer_reviews;
    }

    public boolean isAutomatic_peer_reviews() {
        return automatic_peer_reviews;
    }

    public void setAutomatic_peer_reviews(boolean automatic_peer_reviews) {
        this.automatic_peer_reviews = automatic_peer_reviews;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isGrade_group_students_individually() {
        return grade_group_students_individually;
    }

    public void setGrade_group_students_individually(boolean grade_group_students_individually) {
        this.grade_group_students_individually = grade_group_students_individually;
    }

    public boolean isAnonymous_peer_reviews() {
        return anonymous_peer_reviews;
    }

    public void setAnonymous_peer_reviews(boolean anonymous_peer_reviews) {
        this.anonymous_peer_reviews = anonymous_peer_reviews;
    }

    public Object getGroup_category_id() {
        return group_category_id;
    }

    public void setGroup_category_id(Object group_category_id) {
        this.group_category_id = group_category_id;
    }

    public boolean isPost_to_sis() {
        return post_to_sis;
    }

    public void setPost_to_sis(boolean post_to_sis) {
        this.post_to_sis = post_to_sis;
    }

    public boolean isModerated_grading() {
        return moderated_grading;
    }

    public void setModerated_grading(boolean moderated_grading) {
        this.moderated_grading = moderated_grading;
    }

    public boolean isOmit_from_final_grade() {
        return omit_from_final_grade;
    }

    public void setOmit_from_final_grade(boolean omit_from_final_grade) {
        this.omit_from_final_grade = omit_from_final_grade;
    }

    public boolean isIntra_group_peer_reviews() {
        return intra_group_peer_reviews;
    }

    public void setIntra_group_peer_reviews(boolean intra_group_peer_reviews) {
        this.intra_group_peer_reviews = intra_group_peer_reviews;
    }

    public boolean isAnonymous_instructor_annotations() {
        return anonymous_instructor_annotations;
    }

    public void setAnonymous_instructor_annotations(boolean anonymous_instructor_annotations) {
        this.anonymous_instructor_annotations = anonymous_instructor_annotations;
    }

    public String getSecure_params() {
        return secure_params;
    }

    public void setSecure_params(String secure_params) {
        this.secure_params = secure_params;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHas_submitted_submissions() {
        return has_submitted_submissions;
    }

    public void setHas_submitted_submissions(boolean has_submitted_submissions) {
        this.has_submitted_submissions = has_submitted_submissions;
    }

    public boolean isDue_date_required() {
        return due_date_required;
    }

    public void setDue_date_required(boolean due_date_required) {
        this.due_date_required = due_date_required;
    }

    public int getMax_name_length() {
        return max_name_length;
    }

    public void setMax_name_length(int max_name_length) {
        this.max_name_length = max_name_length;
    }

    public boolean isIn_closed_grading_period() {
        return in_closed_grading_period;
    }

    public void setIn_closed_grading_period(boolean in_closed_grading_period) {
        this.in_closed_grading_period = in_closed_grading_period;
    }

    public boolean isIs_quiz_assignment() {
        return is_quiz_assignment;
    }

    public void setIs_quiz_assignment(boolean is_quiz_assignment) {
        this.is_quiz_assignment = is_quiz_assignment;
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public boolean isAnonymous_submissions() {
        return anonymous_submissions;
    }

    public void setAnonymous_submissions(boolean anonymous_submissions) {
        this.anonymous_submissions = anonymous_submissions;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isOnly_visible_to_overrides() {
        return only_visible_to_overrides;
    }

    public void setOnly_visible_to_overrides(boolean only_visible_to_overrides) {
        this.only_visible_to_overrides = only_visible_to_overrides;
    }

    public boolean isLocked_for_user() {
        return locked_for_user;
    }

    public void setLocked_for_user(boolean locked_for_user) {
        this.locked_for_user = locked_for_user;
    }

    public String getSubmissions_download_url() {
        return submissions_download_url;
    }

    public void setSubmissions_download_url(String submissions_download_url) {
        this.submissions_download_url = submissions_download_url;
    }

    public LockInfoBean getLock_info() {
        return lock_info;
    }

    public void setLock_info(LockInfoBean lock_info) {
        this.lock_info = lock_info;
    }

    public String getLock_explanation() {
        return lock_explanation;
    }

    public void setLock_explanation(String lock_explanation) {
        this.lock_explanation = lock_explanation;
    }

    public List<String> getSubmission_types() {
        return submission_types;
    }

    public void setSubmission_types(List<String> submission_types) {
        this.submission_types = submission_types;
    }

    public static class LockInfoBean implements Serializable{
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof LockInfoBean)) return false;

            LockInfoBean that = (LockInfoBean) o;

            if (isCan_view() != that.isCan_view()) return false;
            if (!getAsset_string().equals(that.getAsset_string())) return false;
            return getLock_at().equals(that.getLock_at());
        }

        @Override
        public int hashCode() {
            int result = getAsset_string().hashCode();
            result = 31 * result + getLock_at().hashCode();
            result = 31 * result + (isCan_view() ? 1 : 0);
            return result;
        }

        /**
         * asset_string : assignment_89
         * lock_at : 2018-06-23T15:59:00Z
         * can_view : true
         */

        private String asset_string;
        private String lock_at;
        private boolean can_view;

        public String getAsset_string() {
            return asset_string;
        }

        public void setAsset_string(String asset_string) {
            this.asset_string = asset_string;
        }

        public String getLock_at() {
            return lock_at;
        }

        public void setLock_at(String lock_at) {
            this.lock_at = lock_at;
        }

        public boolean isCan_view() {
            return can_view;
        }

        public void setCan_view(boolean can_view) {
            this.can_view = can_view;
        }
    }
}
