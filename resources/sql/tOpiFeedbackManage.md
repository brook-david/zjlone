queryByParams
===
* 注释

    select #use("cols")# from t_opi_feedback_manage where #use("condition")#
    
updateNoNullById
===
	update t_opi_feedback_manage set #use("updateCols")# where feedback_id = #feedbackId#
	
deleteById
===
	delete from t_opi_feedback_manage where feedback_id = #feedbackId#

cols
===
    feedback_id,
    feedbacker_id,
    dispose_id,
    content,
    remark,
    feedback_time,
    dispose_time,
    dispose_status,
    delete_flag

updateCols
===
    @trim(){
    @if(!isEmpty(feedbackerId)){
    feedbacker_id=#feedbackerId#,
    @}
    @if(!isEmpty(disposeId)){
    dispose_id=#disposeId#,
    @}
    @if(!isEmpty(content)){
    content=#content#,
    @}
    @if(!isEmpty(remark)){
    remark=#remark#,
    @}
    @if(!isEmpty(feedbackTime)){
    feedback_time=#feedbackTime#,
    @}
    @if(!isEmpty(disposeTime)){
    dispose_time=#disposeTime#,
    @}
    @if(!isEmpty(disposeStatus)){
    dispose_status=#disposeStatus#,
    @}
    @if(!isEmpty(deleteFlag)){
    delete_flag=#deleteFlag#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(feedbackId)){
     and feedback_id=#feedbackId#
    @}
    @if(!isEmpty(feedbackerId)){
     and feedbacker_id=#feedbackerId#
    @}
    @if(!isEmpty(disposeId)){
     and dispose_id=#disposeId#
    @}
    @if(!isEmpty(content)){
     and content=#content#
    @}
    @if(!isEmpty(remark)){
     and remark=#remark#
    @}
    @if(!isEmpty(feedbackTime)){
     and feedback_time=#feedbackTime#
    @}
    @if(!isEmpty(disposeTime)){
     and dispose_time=#disposeTime#
    @}
    @if(!isEmpty(disposeStatus)){
     and dispose_status=#disposeStatus#
    @}
    @if(!isEmpty(deleteFlag)){
     and delete_flag=#deleteFlag#
    @}
