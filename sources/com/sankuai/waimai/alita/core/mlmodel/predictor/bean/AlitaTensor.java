package com.sankuai.waimai.alita.core.mlmodel.predictor.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AlitaTensor {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e09f43129ae0f1b3b15cccf7c700645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e09f43129ae0f1b3b15cccf7c700645");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a2a2ea4191494e2dad6ba5ddec6ef9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a2a2ea4191494e2dad6ba5ddec6ef9d");
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
}
