package com.meituan.android.common.statistics.sensor;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SensorDataElement implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float aX;
    public float aY;
    public float aZ;
    public float gX;
    public float gY;
    public float gZ;
    public float gyX;
    public float gyY;
    public float gyZ;
    public float humidity;
    public float laX;
    public float laY;
    public float laZ;
    public float light;
    public float mfX;
    public float mfY;
    public float mfZ;
    public float pressure;
    public float proximity;
    public String pvCid;
    public float rvX;
    public float rvY;
    public float rvZ;
    public int seq;
    public String stm;
    public float temperature;

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34c03687fb7ce3b0fe88c8c04a131751", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34c03687fb7ce3b0fe88c8c04a131751") : super.clone();
    }

    public JSONObject toJsonObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dee23728b85720cedf68d93a51c56783", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dee23728b85720cedf68d93a51c56783");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("seq", this.seq);
            jSONObject.put(Constants.GestureData.KEY_PV_CID, this.pvCid);
            jSONObject.put("tm", this.stm);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Constants.GestureMoveEvent.KEY_X, this.aX);
            jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, this.aY);
            jSONObject2.put("z", this.aZ);
            jSONObject.put("ac", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(Constants.GestureMoveEvent.KEY_X, this.laX);
            jSONObject3.put(Constants.GestureMoveEvent.KEY_Y, this.laY);
            jSONObject3.put("z", this.laZ);
            jSONObject.put("l_ac", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(Constants.GestureMoveEvent.KEY_X, this.gX);
            jSONObject4.put(Constants.GestureMoveEvent.KEY_Y, this.gY);
            jSONObject4.put("z", this.gZ);
            jSONObject.put(g.n, jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(Constants.GestureMoveEvent.KEY_X, this.gyX);
            jSONObject5.put(Constants.GestureMoveEvent.KEY_Y, this.gyY);
            jSONObject5.put("z", this.gyZ);
            jSONObject.put("gyr", jSONObject5);
            jSONObject.put("temp", this.temperature);
            jSONObject.put("l", this.light);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(Constants.GestureMoveEvent.KEY_X, this.mfX);
            jSONObject6.put(Constants.GestureMoveEvent.KEY_Y, this.mfY);
            jSONObject6.put("z", this.mfZ);
            jSONObject.put("mag", jSONObject6);
            jSONObject.put("p", this.pressure);
            jSONObject.put("pro", this.proximity);
            jSONObject.put("h", this.humidity);
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(Constants.GestureMoveEvent.KEY_X, this.rvX);
            jSONObject7.put(Constants.GestureMoveEvent.KEY_Y, this.rvY);
            jSONObject7.put("z", this.rvZ);
            jSONObject.put("vec", jSONObject7);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
