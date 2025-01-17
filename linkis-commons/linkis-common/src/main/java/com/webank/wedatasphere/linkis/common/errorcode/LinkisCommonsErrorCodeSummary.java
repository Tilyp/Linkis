/*
 *
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.webank.wedatasphere.linkis.common.errorcode;


public enum LinkisCommonsErrorCodeSummary {

    ENGINE_FAILED_STARTED(11000, "engine start failed(引擎启动失败)", "engine start failed(引擎启动失败)", "hiveEngineConn")

    ;
    /**
     * error code （错误编码）
     */
    private int errorCode;
    /**
     * error description （错误描述）
     */
    private String errorDesc;
    /**
     * possible causes of errors （可能发生错误的原因）
     */
    private String comment;
    /**
     * the module of the links to which it belongs （所属linkis的模块）
     */
    private String module;

    LinkisCommonsErrorCodeSummary(int errorCode, String errorDesc, String comment, String module) {
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.comment = comment;
        this.module = module;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }


    @Override
    public String toString() {
        return "errorCode: " + this.errorCode + ", errorDesc:" + this.errorDesc;
    }
}
