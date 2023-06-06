package com.sankuai.waimai.alita.core.mlmodel.predictor.mtnn;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.itc.android.mtnn.c;
import com.meituan.itc.android.mtnn.d;
import com.meituan.itc.android.mtnn.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.DataType;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.e;
import com.sankuai.waimai.alita.core.mlmodel.predictor.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.alita.core.mlmodel.predictor.base.a {
    public static ChangeQuickRedirect b = null;
    public static String c = "";
    private d d;
    private String e;
    private String f;
    private String g;

    public a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "284114914457920ae4a0d0096000ddde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "284114914457920ae4a0d0096000ddde");
            return;
        }
        this.e = str;
        this.f = str2;
        this.g = str3;
        a(str);
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55475d6cd5d968a619b249eee37b9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55475d6cd5d968a619b249eee37b9d4");
            return;
        }
        d.a aVar = new d.a();
        aVar.a = c.FORWARD_CPU.g;
        aVar.b = 3;
        aVar.c = null;
        try {
            this.d = d.a(str, aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.base.a
    public final void a(TensorConfig tensorConfig, @NonNull List<AlitaTensor> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable h hVar) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {tensorConfig, list, list2, hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3382b248c24f16858da5ebeb720db714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3382b248c24f16858da5ebeb720db714");
            return;
        }
        if (this.d == null) {
            a(this.e);
        }
        if (this.d != null) {
            List<AlitaTensor> a = a(list2);
            Object[] objArr2 = {list, a};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ce87c8a379b3a56612262a112d91c4", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ce87c8a379b3a56612262a112d91c4")).booleanValue();
            } else if (e.a(list)) {
                Object[] objArr3 = {a};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ce654c11ad5e6a1327be576bce73a613", RobustBitConfig.DEFAULT_VALUE)) {
                    if (!CollectionUtils.isEmpty(a)) {
                        for (AlitaTensor alitaTensor : a) {
                            if (alitaTensor != null) {
                                if (alitaTensor.getName() == null) {
                                }
                            }
                        }
                        z = true;
                    }
                    z = false;
                    break;
                }
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ce654c11ad5e6a1327be576bce73a613")).booleanValue();
                if (z) {
                    z2 = true;
                }
            }
            if (!z2) {
                a(hVar, new Exception("AlitaTensor not valid"));
                return;
            }
            try {
                a(tensorConfig, list);
                b(list);
                com.meituan.itc.android.mtnn.b b2 = this.d.b();
                if (b2 != com.meituan.itc.android.mtnn.b.NO_ERROR) {
                    throw new Exception("MTNN predict fail, err = " + b2.name());
                }
                c(a);
                a(hVar, d(a));
                return;
            } catch (Exception e) {
                a(hVar, e);
                return;
            }
        }
        a(hVar, new Exception("MTNN Predictor Create Failed"));
    }

    private void a(TensorConfig tensorConfig, @NonNull List<AlitaTensor> list) throws Exception {
        int i;
        boolean z;
        int length;
        Object[] objArr = {tensorConfig, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61758c5d63bc0d9994c5a7dd08aed097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61758c5d63bc0d9994c5a7dd08aed097");
        } else if (tensorConfig != null && tensorConfig.customConfig != null && (i = tensorConfig.customConfig.batchSize) > 1) {
            Object[] objArr2 = {Integer.valueOf(i), list};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e7793a15b3c70aaa4720b5d524e2199", RobustBitConfig.DEFAULT_VALUE)) {
                Iterator<AlitaTensor> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    AlitaTensor next = it.next();
                    if (next.getDataType() == DataType.INT32) {
                        length = next.getIntData().length;
                    } else {
                        length = next.getDataType() == DataType.FLOAT32 ? next.getFloatData().length : 0;
                    }
                    if (length % i != 0) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e7793a15b3c70aaa4720b5d524e2199")).booleanValue();
            }
            if (z) {
                for (AlitaTensor alitaTensor : list) {
                    if (alitaTensor != null) {
                        f a = this.d.a(alitaTensor.getName());
                        int[] iArr = new int[2];
                        if (alitaTensor.getDataType() == DataType.INT32) {
                            iArr[0] = i;
                            iArr[1] = alitaTensor.getIntData().length / i;
                        } else if (alitaTensor.getDataType() == DataType.FLOAT32) {
                            iArr[0] = i;
                            iArr[1] = alitaTensor.getFloatData().length / i;
                        }
                        a.a(iArr);
                    }
                }
                this.d.c();
                return;
            }
            throw new Exception("tensorSize不能被batchSize整除");
        }
    }

    private List<AlitaTensor> a(List<TensorConfig.TensorConfigItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7766c91b112390f963a76bb4b6f2ea0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7766c91b112390f963a76bb4b6f2ea0");
        }
        try {
            Object[] objArr2 = {list};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.mlmodel.predictor.d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e68b4d79b4ab1ee41a034d44ffff5509", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e68b4d79b4ab1ee41a034d44ffff5509");
            }
            if (CollectionUtils.isEmpty(list)) {
                throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d("AlitaTensorParser tensorConfig output is empty");
            }
            ArrayList arrayList = new ArrayList();
            for (TensorConfig.TensorConfigItem tensorConfigItem : list) {
                AlitaTensor alitaTensor = new AlitaTensor();
                alitaTensor.setName(tensorConfigItem.name);
                String str = tensorConfigItem.type;
                char c2 = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 104431) {
                    if (hashCode == 97526364 && str.equals("float")) {
                        c2 = 1;
                    }
                } else if (str.equals("int")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        alitaTensor.setDataType(DataType.INT32);
                        break;
                    case 1:
                        alitaTensor.setDataType(DataType.FLOAT32);
                        break;
                }
                arrayList.add(alitaTensor);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private void b(List<AlitaTensor> list) throws Exception {
        boolean b2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b25586e05a8734bba13886897d115d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b25586e05a8734bba13886897d115d");
            return;
        }
        String str = "";
        Iterator<AlitaTensor> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                AlitaTensor next = it.next();
                if (next != null) {
                    String name = next.getName();
                    f a = this.d.a(name);
                    if (a == null) {
                        str = "not found inputTensor from model, tensor = " + name;
                    } else {
                        int d = a.d();
                        switch (next.getDataType()) {
                            case INT32:
                                int[] intData = next.getIntData();
                                int length = intData != null ? intData.length : 0;
                                if (d != length) {
                                    str = "not match inputTensor size，tensorName = " + name + ", modelSize = " + d + ", alitaSize = " + length;
                                    b2 = false;
                                    break;
                                } else {
                                    b2 = a.b(intData);
                                    if (!b2) {
                                        str = "set input err, tensor = " + name;
                                        break;
                                    }
                                }
                                break;
                            case FLOAT32:
                                float[] floatData = next.getFloatData();
                                int length2 = floatData != null ? floatData.length : 0;
                                if (d != length2) {
                                    str = "not match inputTensor size，tensorName = " + name + ", modelSize = " + d + ", alitaSize = " + length2;
                                    b2 = false;
                                    break;
                                } else {
                                    b2 = a.a(floatData);
                                    if (!b2) {
                                        str = "set input err, tensor = " + name;
                                        break;
                                    }
                                }
                                break;
                            default:
                                str = "only support float and int, tensor = " + name;
                                b2 = false;
                                break;
                        }
                        if (b2) {
                        }
                    }
                }
            }
        }
        if (!str.isEmpty()) {
            throw new Exception(str);
        }
    }

    private void c(List<AlitaTensor> list) throws Exception {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595b52f675e48fed00f4df27314afda9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595b52f675e48fed00f4df27314afda9");
            return;
        }
        for (AlitaTensor alitaTensor : list) {
            f b2 = this.d.b(alitaTensor.getName());
            switch (alitaTensor.getDataType()) {
                case INT32:
                    alitaTensor.setIntData(b2.c());
                    break;
                case FLOAT32:
                    alitaTensor.setFloatData(b2.b());
                    break;
            }
        }
    }

    private JSONObject d(List<AlitaTensor> list) throws JSONException {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a56a7439ecd5289762eaac1368a87d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a56a7439ecd5289762eaac1368a87d2");
        }
        JSONObject jSONObject = null;
        if (!list.isEmpty()) {
            jSONObject = new JSONObject();
            for (AlitaTensor alitaTensor : list) {
                switch (alitaTensor.getDataType()) {
                    case INT32:
                        JSONArray jSONArray = new JSONArray();
                        int[] intData = alitaTensor.getIntData();
                        if (intData != null) {
                            for (int i : intData) {
                                jSONArray.put(i);
                            }
                        }
                        jSONObject.put(alitaTensor.getName(), jSONArray);
                        break;
                    case FLOAT32:
                        JSONArray jSONArray2 = new JSONArray();
                        float[] floatData = alitaTensor.getFloatData();
                        if (floatData != null) {
                            for (float f : floatData) {
                                jSONArray2.put(f);
                            }
                        }
                        jSONObject.put(alitaTensor.getName(), jSONArray2);
                        break;
                }
            }
        }
        return jSONObject;
    }
}
