package com.meituan.android.common.aidata.ai.mlmodel.predictor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AiTensor {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DataType dataType;
    private float[] floatData;
    private int index;
    private int[] intData;
    private String name;
    private int[] shape;

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int[] getShape() {
        return this.shape;
    }

    public void setShape(int[] iArr) {
        this.shape = iArr;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public int[] getIntData() {
        return this.intData;
    }

    public void setIntData(int[] iArr) {
        this.intData = iArr;
    }

    public void setIntData(List<Integer> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "250d0d0777e91b14597ba3cf62807c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "250d0d0777e91b14597ba3cf62807c63");
            return;
        }
        int[] iArr = new int[list.size()];
        for (Integer num : list) {
            iArr[i] = num.intValue();
            i++;
        }
        this.intData = iArr;
        setDataType(DataType.INT32);
    }

    public float[] getFloatData() {
        return this.floatData;
    }

    public void setFloatData(float[] fArr) {
        this.floatData = fArr;
    }

    public void setFloatData(List<Float> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751779a0bd5e0952f4596fb0cfcc1262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751779a0bd5e0952f4596fb0cfcc1262");
            return;
        }
        float[] fArr = new float[list.size()];
        for (Float f : list) {
            fArr[i] = f.floatValue();
            i++;
        }
        this.floatData = fArr;
        setDataType(DataType.FLOAT32);
    }

    public JSONObject toJsonObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fa1cc93eb9271ac1a21125c9cb5d7b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fa1cc93eb9271ac1a21125c9cb5d7b9");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (DataType.INT32 == this.dataType) {
                jSONObject.put(this.name, new JSONArray(this.intData));
            } else if (DataType.FLOAT32 == this.dataType) {
                jSONObject.put(this.name, new JSONArray(this.floatData));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
