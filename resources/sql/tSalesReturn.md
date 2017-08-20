queryByParams
===
* 注释

    select #use("cols")# from t_sales_return where #use("condition")#
    
updateNoNullById
===
	update t_sales_return set #use("updateCols")# where return_id = #returnId#
	
deleteById
===
	delete from t_sales_return where return_id = #returnId#

cols
===
    return_id,
    sales_id,
    unit_price,
    number,
    remark,
    create_time

updateCols
===
    @trim(){
    @if(!isEmpty(salesId)){
    sales_id=#salesId#,
    @}
    @if(!isEmpty(unitPrice)){
    unit_price=#unitPrice#,
    @}
    @if(!isEmpty(number)){
    number=#number#,
    @}
    @if(!isEmpty(remark)){
    remark=#remark#,
    @}
    @if(!isEmpty(createTime)){
    create_time=#createTime#,
    @}
    @}

condition
===

    1 = 1
    @if(!isEmpty(returnId)){
     and return_id=#returnId#
    @}
    @if(!isEmpty(salesId)){
     and sales_id=#salesId#
    @}
    @if(!isEmpty(unitPrice)){
     and unit_price=#unitPrice#
    @}
    @if(!isEmpty(number)){
     and number=#number#
    @}
    @if(!isEmpty(remark)){
     and remark=#remark#
    @}
    @if(!isEmpty(createTime)){
     and create_time=#createTime#
    @}
