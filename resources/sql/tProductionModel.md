queryByParams
===
* 注释

    select #use("cols")# from t_production_model where #use("condition")#
    
updateNoNullById
===
	update t_production_model set #use("updateCols")# where model_id = #modelId#
	
deleteById
===
	delete from t_production_model where model_id = #modelId#

cols
===
    model_id,
    name,
    version,
    color,
    stock,
    delete_flag,
    create_time,
    update_time

updateCols
===
    @trim(){
    @if(!isEmpty(name)){
    name=#name#,
    @}
    @if(!isEmpty(version)){
    version=#version#,
    @}
    @if(!isEmpty(color)){
    color=#color#,
    @}
    @if(!isEmpty(stock)){
    stock=#stock#,
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
    @if(!isEmpty(modelId)){
     and model_id=#modelId#
    @}
    @if(!isEmpty(name)){
     and name=#name#
    @}
    @if(!isEmpty(version)){
     and version=#version#
    @}
    @if(!isEmpty(color)){
     and color=#color#
    @}
    @if(!isEmpty(stock)){
     and stock=#stock#
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
