queryByParams
===
* 注释

    select #use("cols")# from t_member where #use("condition")#
    
updateNoNullById
===
	update t_member set #use("updateCols")# where member_id = #memberId#
	
deleteById
===
	delete from t_member where member_id = #memberId#

cols
===
    member_id,
    attention_relation_id,
    account,
    account_identity,
    password,
    email,
    phone_number,
    avatar_path,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(attentionRelationId)){
    attention_relation_id=#attentionRelationId#,
    @}
    @if(!isEmpty(account)){
    account=#account#,
    @}
    @if(!isEmpty(accountIdentity)){
    account_identity=#accountIdentity#,
    @}
    @if(!isEmpty(password)){
    password=#password#,
    @}
    @if(!isEmpty(email)){
    email=#email#,
    @}
    @if(!isEmpty(phoneNumber)){
    phone_number=#phoneNumber#,
    @}
    @if(!isEmpty(avatarPath)){
    avatar_path=#avatarPath#,
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
    @if(!isEmpty(memberId)){
     and member_id=#memberId#
    @}
    @if(!isEmpty(attentionRelationId)){
     and attention_relation_id=#attentionRelationId#
    @}
    @if(!isEmpty(account)){
     and account=#account#
    @}
    @if(!isEmpty(accountIdentity)){
     and account_identity=#accountIdentity#
    @}
    @if(!isEmpty(password)){
     and password=#password#
    @}
    @if(!isEmpty(email)){
     and email=#email#
    @}
    @if(!isEmpty(phoneNumber)){
     and phone_number=#phoneNumber#
    @}
    @if(!isEmpty(avatarPath)){
     and avatar_path=#avatarPath#
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
