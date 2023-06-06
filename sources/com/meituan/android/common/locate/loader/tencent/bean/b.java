package com.meituan.android.common.locate.loader.tencent.bean;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class b implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object a;

    public b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "761a4448f031a32e9f929f8c1a923619", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "761a4448f031a32e9f929f8c1a923619");
        } else {
            this.a = obj;
        }
    }

    private Object a(String str) {
        StringBuilder sb;
        String message;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4648dbede54ddfe70e5af5540a3ca8e", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4648dbede54ddfe70e5af5540a3ca8e");
        }
        try {
            return this.a.getClass().getDeclaredMethod(str, new Class[0]).invoke(this.a, new Object[0]);
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        } catch (NoSuchMethodException e2) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        } catch (Exception e4) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        }
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c4c389befc974792f1155256da8469c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c4c389befc974792f1155256da8469c");
        }
        Object a = a("getProvider");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public double b() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6a5ad0e25f4d716fce05585e02a1a28", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6a5ad0e25f4d716fce05585e02a1a28");
        } else {
            a = a("getLatitude");
            if (a == null) {
                return 0.0d;
            }
        }
        return ((Double) a).doubleValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public double c() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "547fad786f6daaf00f89337aca2f5e61", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "547fad786f6daaf00f89337aca2f5e61");
        } else {
            a = a("getLongitude");
            if (a == null) {
                return 0.0d;
            }
        }
        return ((Double) a).doubleValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public float d() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ccc500c8bb2dfcc47a5b7d303db9cbb", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ccc500c8bb2dfcc47a5b7d303db9cbb");
        } else {
            a = a("getAccuracy");
            if (a == null) {
                return 0.0f;
            }
        }
        return ((Float) a).floatValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0bacac3a804b1575601902d85820dea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0bacac3a804b1575601902d85820dea");
        }
        Object a = a("getName");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3492330c5fa0f8d1cbccf02c5ac22957", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3492330c5fa0f8d1cbccf02c5ac22957");
        }
        Object a = a("getAddress");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd5a4e74382ff1df39f3c41a7e4ff96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd5a4e74382ff1df39f3c41a7e4ff96");
        }
        Object a = a("getNation");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3feb5d14fede2b8d717d104f045c60fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3feb5d14fede2b8d717d104f045c60fc");
        }
        Object a = a("getProvince");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d51fcbb0b31cbd529d39b519daedbb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d51fcbb0b31cbd529d39b519daedbb0");
        }
        Object a = a("getCity");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52cdd7f0fbaf2752115ad3ebc5f579b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52cdd7f0fbaf2752115ad3ebc5f579b4");
        }
        Object a = a("getDistrict");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12f66fa56db584528aa2bd060c5cb491", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12f66fa56db584528aa2bd060c5cb491");
        }
        Object a = a("getStreet");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36e94f651912079ef58a5df701913ccb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36e94f651912079ef58a5df701913ccb");
        }
        Object a = a("getStreetNo");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public List<c> m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e82942b7075a2e6b4a9923bbf36ff4a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e82942b7075a2e6b4a9923bbf36ff4a8");
        }
        Object a = a("getPoiList");
        if (a instanceof List) {
            List<Object> list = (List) a;
            if (list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    arrayList.add(new d(obj));
                }
                return arrayList;
            }
            return null;
        }
        return null;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public float n() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b6b355108c2a91599ca9381fd21bfbd", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b6b355108c2a91599ca9381fd21bfbd");
        } else {
            a = a("getBearing");
            if (a == null) {
                return 0.0f;
            }
        }
        return ((Float) a).floatValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public float o() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "360427864c9802fad09bdbb777ecbfe5", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "360427864c9802fad09bdbb777ecbfe5");
        } else {
            a = a("getSpeed");
            if (a == null) {
                return 0.0f;
            }
        }
        return ((Float) a).floatValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public long p() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c52ff9da366b6c74bc3eb55738ed3669", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c52ff9da366b6c74bc3eb55738ed3669");
        } else {
            a = a("getTime");
            if (a == null) {
                return 0L;
            }
        }
        return ((Long) a).longValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public int q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee705b33a96a5d5bef445a82e5ce1868", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee705b33a96a5d5bef445a82e5ce1868")).intValue();
        }
        Object a = a("getGPSRssi");
        if (a == null) {
            return 0;
        }
        return ((Integer) a).intValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b734d2ef2a168bacf5692f599bc5b4e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b734d2ef2a168bacf5692f599bc5b4e7");
        }
        Object a = a("getCityCode");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ded4411b691282d255115bd6f43ceac8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ded4411b691282d255115bd6f43ceac8")).intValue();
        }
        Object a = a("getCoordinateType");
        if (a == null) {
            return 0;
        }
        return ((Integer) a).intValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.a
    public Bundle t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "004ff291b5afafd27c890f3ce1adb2d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "004ff291b5afafd27c890f3ce1adb2d7");
        }
        Object a = a("getExtra");
        if (a == null) {
            return null;
        }
        return (Bundle) a;
    }
}
