queryByParams
===
* 注释

    select #use("cols")# from t_member_audit_log where #use("condition")#
    
updateNoNullById
===
	update t_member_audit_log set #use("updateCols")# where audit_id = #auditId#
	
deleteById
===
	delete from t_member_audit_log where audit_id = #auditId#

cols
===
    audit_id,
    member_id,
    login_time,
    login_status,
    logout_time,
    logout_type

updateCols
===
    @trim(){
    @if(!isEmpty(memberId)){
    member_id=#memberId#,
    @}
    @if(!isEmpty(loginTime)){
    login_time=#loginTime#,
    @}
    @if(!isEmpty(loginStatus)){
    login_status=#loginStatus#,
    @}
    @if(!isEmpty(logoutTime)){
    logout_time=#logoutTime#,
    @}
    @if(!isEmpty(logoutType)){
    logout_type=#logoutType#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(auditId)){
     and audit_id=#auditId#
    @}
    @if(!isEmpty(memberId)){
     and member_id=#memberId#
    @}
    @if(!isEmpty(loginTime)){
     and login_time=#loginTime#
    @}
    @if(!isEmpty(loginStatus)){
     and login_status=#loginStatus#
    @}
    @if(!isEmpty(logoutTime)){
     and logout_time=#logoutTime#
    @}
    @if(!isEmpty(logoutType)){
     and logout_type=#logoutType#
    @}
