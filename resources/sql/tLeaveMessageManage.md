queryByParams
===
* 注释

    select #use("cols")# from t_leave_message_manage where #use("condition")#
    
updateNoNullById
===
	update t_leave_message_manage set #use("updateCols")# where lm_id = #lmId#
	
deleteById
===
	delete from t_leave_message_manage where lm_id = #lmId#

cols
===
    lm_id,
    int_pen_id,
    lm_title,
    lm_content,
    lm_read_flag,
    lm_from_member_id,
    delete_flag,
    lm_time,
    lm_read_time

updateCols
===
    @trim(){
    @if(!isEmpty(intPenId)){
    int_pen_id=#intPenId#,
    @}
    @if(!isEmpty(lmTitle)){
    lm_title=#lmTitle#,
    @}
    @if(!isEmpty(lmContent)){
    lm_content=#lmContent#,
    @}
    @if(!isEmpty(lmReadFlag)){
    lm_read_flag=#lmReadFlag#,
    @}
    @if(!isEmpty(lmFromMemberId)){
    lm_from_member_id=#lmFromMemberId#,
    @}
    @if(!isEmpty(deleteFlag)){
    delete_flag=#deleteFlag#,
    @}
    @if(!isEmpty(lmTime)){
    lm_time=#lmTime#,
    @}
    @if(!isEmpty(lmReadTime)){
    lm_read_time=#lmReadTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(lmId)){
     and lm_id=#lmId#
    @}
    @if(!isEmpty(intPenId)){
     and int_pen_id=#intPenId#
    @}
    @if(!isEmpty(lmTitle)){
     and lm_title=#lmTitle#
    @}
    @if(!isEmpty(lmContent)){
     and lm_content=#lmContent#
    @}
    @if(!isEmpty(lmReadFlag)){
     and lm_read_flag=#lmReadFlag#
    @}
    @if(!isEmpty(lmFromMemberId)){
     and lm_from_member_id=#lmFromMemberId#
    @}
    @if(!isEmpty(deleteFlag)){
     and delete_flag=#deleteFlag#
    @}
    @if(!isEmpty(lmTime)){
     and lm_time=#lmTime#
    @}
    @if(!isEmpty(lmReadTime)){
     and lm_read_time=#lmReadTime#
    @}
