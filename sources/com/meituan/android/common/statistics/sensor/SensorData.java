package com.meituan.android.common.statistics.sensor;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SensorData {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String collectId;
    private List<SensorDataElement> dispatchBlueElementList;
    private List<SensorDataElement> elementList;

    public SensorData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba3a4822a38aefd4c7545de832478bd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba3a4822a38aefd4c7545de832478bd9");
            return;
        }
        this.elementList = new ArrayList();
        this.dispatchBlueElementList = new ArrayList();
    }

    public synchronized void addElement(SensorDataElement sensorDataElement) {
        Object[] objArr = {sensorDataElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e30d05be923129189123254970f10f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e30d05be923129189123254970f10f3");
            return;
        }
        this.elementList.add(sensorDataElement);
        this.dispatchBlueElementList.add(sensorDataElement);
    }

    public void setCollectId(String str) {
        this.collectId = str;
    }

    public int getElementCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b717a37b9a77d4cb937ca54a0eb4b28", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b717a37b9a77d4cb937ca54a0eb4b28")).intValue() : this.elementList.size();
    }

    public int getDispatchBlueElementCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "858656bcbb0131b29576fa2ca36ab5cf", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "858656bcbb0131b29576fa2ca36ab5cf")).intValue() : this.dispatchBlueElementList.size();
    }

    public synchronized JSONObject toBlueJsonObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6bace3fb4d670bf2457c167bae5bf71", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6bace3fb4d670bf2457c167bae5bf71");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("sensor", jSONArray);
            jSONObject.put(Constants.GestureData.KEY_COLLECT_ID, this.collectId);
            if (this.dispatchBlueElementList != null && !this.dispatchBlueElementList.isEmpty()) {
                for (SensorDataElement sensorDataElement : this.dispatchBlueElementList) {
                    if (sensorDataElement != null) {
                        jSONArray.put(sensorDataElement.toJsonObject());
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public synchronized JSONObject toValLabLastJsonObject(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d10b3c106121a1555f58f7e61d46a78d", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d10b3c106121a1555f58f7e61d46a78d");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("sensor", jSONArray);
            jSONObject.put(Constants.GestureData.KEY_COLLECT_ID, this.collectId);
            jSONObject.put("total_num", this.elementList.size());
            if (this.elementList != null && !this.elementList.isEmpty()) {
                while (i < this.elementList.size()) {
                    SensorDataElement sensorDataElement = this.elementList.get(i);
                    LogUtil.log("Sensor: report index=" + i);
                    if (sensorDataElement != null) {
                        jSONArray.put(sensorDataElement.toJsonObject());
                    }
                    i++;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public synchronized JSONObject toValLabJsonObject(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39d2f917d12fd64f3dd951c561b4ea72", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39d2f917d12fd64f3dd951c561b4ea72");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("sensor", jSONArray);
            jSONObject.put(Constants.GestureData.KEY_COLLECT_ID, this.collectId);
            jSONObject.put("total_num", this.elementList.size());
            if (this.elementList != null && !this.elementList.isEmpty()) {
                int i2 = i * 15;
                for (int i3 = 0; i3 < 15; i3++) {
                    if (i2 >= this.elementList.size()) {
                        break;
                    }
                    LogUtil.log("Sensor: report index=" + i2);
                    SensorDataElement sensorDataElement = this.elementList.get(i2);
                    if (sensorDataElement != null) {
                        jSONArray.put(sensorDataElement.toJsonObject());
                    }
                    i2++;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public synchronized void cleanBlueDispatchBlueElementList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "111da34cf73bbc9629b500638ee1d046", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "111da34cf73bbc9629b500638ee1d046");
            return;
        }
        if (this.dispatchBlueElementList != null) {
            this.dispatchBlueElementList.clear();
        }
    }

    public synchronized void cleanElementList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1711586732ff940009d7c862d49dc205", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1711586732ff940009d7c862d49dc205");
            return;
        }
        if (this.elementList != null) {
            this.elementList.clear();
        }
    }
}
