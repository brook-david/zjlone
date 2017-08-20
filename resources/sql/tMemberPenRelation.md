queryByParams
===
* 注释

    select #use("cols")# from t_member_pen_relation where #use("condition")#
    
updateNoNullById
===
	update t_member_pen_relation set #use("updateCols")# where relation_id = #relationId#
	
deleteById
===
	delete from t_member_pen_relation where relation_id = #relationId#

cols
===
    relation_id,
    member_id,
    int_pen_id,
    account_identity,
    avatar_path,
    age,
    gender,
    myopia_flag,
    height,
    school,
    school_grade,
    used_time,
    status,
    province,
    city,
    area,
    birthday,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(memberId)){
    member_id=#memberId#,
    @}
    @if(!isEmpty(intPenId)){
    int_pen_id=#intPenId#,
    @}
    @if(!isEmpty(accountIdentity)){
    account_identity=#accountIdentity#,
    @}
    @if(!isEmpty(avatarPath)){
    avatar_path=#avatarPath#,
    @}
    @if(!isEmpty(age)){
    age=#age#,
    @}
    @if(!isEmpty(gender)){
    gender=#gender#,
    @}
    @if(!isEmpty(myopiaFlag)){
    myopia_flag=#myopiaFlag#,
    @}
    @if(!isEmpty(height)){
    height=#height#,
    @}
    @if(!isEmpty(school)){
    school=#school#,
    @}
    @if(!isEmpty(schoolGrade)){
    school_grade=#schoolGrade#,
    @}
    @if(!isEmpty(usedTime)){
    used_time=#usedTime#,
    @}
    @if(!isEmpty(status)){
    status=#status#,
    @}
    @if(!isEmpty(province)){
    province=#province#,
    @}
    @if(!isEmpty(city)){
    city=#city#,
    @}
    @if(!isEmpty(area)){
    area=#area#,
    @}
    @if(!isEmpty(birthday)){
    birthday=#birthday#,
    @}
    @if(!isEmpty(deleteFlag)){
    delete_flag=#deleteFlag#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @if(!isEmpty(updateTime)){
    update_time=#updateTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(relationId)){
     and relation_id=#relationId#
    @}
    @if(!isEmpty(memberId)){
     and member_id=#memberId#
    @}
    @if(!isEmpty(intPenId)){
     and int_pen_id=#intPenId#
    @}
    @if(!isEmpty(accountIdentity)){
     and account_identity=#accountIdentity#
    @}
    @if(!isEmpty(avatarPath)){
     and avatar_path=#avatarPath#
    @}
    @if(!isEmpty(age)){
     and age=#age#
    @}
    @if(!isEmpty(gender)){
     and gender=#gender#
    @}
    @if(!isEmpty(myopiaFlag)){
     and myopia_flag=#myopiaFlag#
    @}
    @if(!isEmpty(height)){
     and height=#height#
    @}
    @if(!isEmpty(school)){
     and school=#school#
    @}
    @if(!isEmpty(schoolGrade)){
     and school_grade=#schoolGrade#
    @}
    @if(!isEmpty(usedTime)){
     and used_time=#usedTime#
    @}
    @if(!isEmpty(status)){
     and status=#status#
    @}
    @if(!isEmpty(province)){
     and province=#province#
    @}
    @if(!isEmpty(city)){
     and city=#city#
    @}
    @if(!isEmpty(area)){
     and area=#area#
    @}
    @if(!isEmpty(birthday)){
     and birthday=#birthday#
    @}
    @if(!isEmpty(deleteFlag)){
     and delete_flag=#deleteFlag#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
    @if(!isEmpty(updateTime)){
     and update_time=#updateTime#
    @}
