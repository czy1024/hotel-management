/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.altersoftware.hotel.checkIn.tencentcloudapi.ocr.v20181119.models;

import java.util.HashMap;

import com.altersoftware.hotel.checkIn.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DutyPaidProofOCRResponse extends AbstractModel {

    /**
     * 完税证明识别结果，具体内容请点击左侧链接。
     */
    @SerializedName("DutyPaidProofInfos")
    @Expose
    private DutyPaidProofInfo[] DutyPaidProofInfos;

    /**
     * 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     */
    @SerializedName("Angle")
    @Expose
    private Float               Angle;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String              RequestId;

    /**
     * Get 完税证明识别结果，具体内容请点击左侧链接。
     *
     * @return DutyPaidProofInfos 完税证明识别结果，具体内容请点击左侧链接。
     */
    public DutyPaidProofInfo[] getDutyPaidProofInfos() {
        return this.DutyPaidProofInfos;
    }

    /**
     * Set 完税证明识别结果，具体内容请点击左侧链接。
     *
     * @param DutyPaidProofInfos 完税证明识别结果，具体内容请点击左侧链接。
     */
    public void setDutyPaidProofInfos(DutyPaidProofInfo[] DutyPaidProofInfos) {
        this.DutyPaidProofInfos = DutyPaidProofInfos;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     *
     * @return Angle 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     *
     * @param Angle 图片旋转角度（角度制），文本的水平方向为0°，顺时针为正，逆时针为负。
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DutyPaidProofInfos.", this.DutyPaidProofInfos);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
