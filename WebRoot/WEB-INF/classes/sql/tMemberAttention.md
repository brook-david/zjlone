queryByParams
===
* 注释

    select #use("cols")# from t_member_attention where #use("condition")#
    
updateNoNullById
===
	update t_member_attention set #use("updateCols")# where attention_id = #attentionId#
	
deleteById
===
	delete from t_member_attention where attention_id = #attentionId#

cols
===
    attention_id,
    member_id,
    relation_id,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(memberId)){
    member_id=#memberId#,
    @}
    @if(!isEmpty(relationId)){
    relation_id=#relationId#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(attentionId)){
     and attention_id=#attentionId#
    @}
    @if(!isEmpty(memberId)){
     and member_id=#memberId#
    @}
    @if(!isEmpty(relationId)){
     and relation_id=#relationId#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
