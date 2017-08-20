queryByParams
===
* 注释

    select #use("cols")# from t_member_pen_ag where #use("condition")#
    
updateNoNullById
===
	update t_member_pen_ag set #use("updateCols")# where ag_id = #agId#
	
deleteById
===
	delete from t_member_pen_ag where ag_id = #agId#

cols
===
    ag_id,
    relation_id,
    score,
    use_time,
    write_time,
    angle_error_count,
    angle_error_time,
    distanc_error_count,
    distanc_error_time,
    light_error_count,
    light_error_time,
    ag_time,
    insert_time

updateCols
===
    @trim(){
    @if(!isEmpty(relationId)){
    relation_id=#relationId#,
    @}
    @if(!isEmpty(score)){
    score=#score#,
    @}
    @if(!isEmpty(useTime)){
    use_time=#useTime#,
    @}
    @if(!isEmpty(writeTime)){
    write_time=#writeTime#,
    @}
    @if(!isEmpty(angleErrorCount)){
    angle_error_count=#angleErrorCount#,
    @}
    @if(!isEmpty(angleErrorTime)){
    angle_error_time=#angleErrorTime#,
    @}
    @if(!isEmpty(distancErrorCount)){
    distanc_error_count=#distancErrorCount#,
    @}
    @if(!isEmpty(distancErrorTime)){
    distanc_error_time=#distancErrorTime#,
    @}
    @if(!isEmpty(lightErrorCount)){
    light_error_count=#lightErrorCount#,
    @}
    @if(!isEmpty(lightErrorTime)){
    light_error_time=#lightErrorTime#,
    @}
    @if(!isEmpty(agTime)){
    ag_time=#agTime#,
    @}
    @if(!isEmpty(insertTime)){
    insert_time=#insertTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(agId)){
     and ag_id=#agId#
    @}
    @if(!isEmpty(relationId)){
     and relation_id=#relationId#
    @}
    @if(!isEmpty(score)){
     and score=#score#
    @}
    @if(!isEmpty(useTime)){
     and use_time=#useTime#
    @}
    @if(!isEmpty(writeTime)){
     and write_time=#writeTime#
    @}
    @if(!isEmpty(angleErrorCount)){
     and angle_error_count=#angleErrorCount#
    @}
    @if(!isEmpty(angleErrorTime)){
     and angle_error_time=#angleErrorTime#
    @}
    @if(!isEmpty(distancErrorCount)){
     and distanc_error_count=#distancErrorCount#
    @}
    @if(!isEmpty(distancErrorTime)){
     and distanc_error_time=#distancErrorTime#
    @}
    @if(!isEmpty(lightErrorCount)){
     and light_error_count=#lightErrorCount#
    @}
    @if(!isEmpty(lightErrorTime)){
     and light_error_time=#lightErrorTime#
    @}
    @if(!isEmpty(agTime)){
     and ag_time=#agTime#
    @}
    @if(!isEmpty(insertTime)){
     and insert_time=#insertTime#
    @}
