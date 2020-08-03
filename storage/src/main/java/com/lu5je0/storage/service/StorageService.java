package com.lu5je0.storage.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.BusinessActionContextParameter;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

/**
 * @author lijunjie
 * @since 2020/7/21
 */
@LocalTCC
public interface StorageService {
    String func();

    @TwoPhaseBusinessAction(name = "reduceStorage", commitMethod = "commit", rollbackMethod = "rollback")
    void reduceStorage(BusinessActionContext businessActionContext, @BusinessActionContextParameter(paramName = "count") int count);

    boolean commit(BusinessActionContext businessActionContext);

    boolean rollback(BusinessActionContext businessActionContext);
}
