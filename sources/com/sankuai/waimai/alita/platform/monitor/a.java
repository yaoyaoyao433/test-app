package com.sankuai.waimai.alita.platform.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.c;
import com.sankuai.waimai.alita.core.engine.i;
import com.sankuai.waimai.alita.platform.monitor.impl.a;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;
    private HashMap<String, a.c> b;
    private HashMap<String, Integer> c;
    private HashMap<String, Integer> d;

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538eaf103e1608ee8c6cac77d2579eb2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538eaf103e1608ee8c6cac77d2579eb2") : i == 2 ? "alita_feature_" : i == 3 ? "alita_operator_" : "alita_algorithm_";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1db86d82055832d68b9896732edf3aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1db86d82055832d68b9896732edf3aa");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
    }

    private synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b7018e470e5bdc2df39b0f2fe417b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b7018e470e5bdc2df39b0f2fe417b0");
        } else {
            this.b.remove(c.b(str));
        }
    }

    private synchronized void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954bf2d6bc03dfde40f6c8678c32ec3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954bf2d6bc03dfde40f6c8678c32ec3d");
        } else {
            this.c.remove(str);
        }
    }

    private synchronized void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f943494fe849c866798940d1290c699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f943494fe849c866798940d1290c699");
        } else {
            this.d.remove(str);
        }
    }

    private synchronized void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01da40c663b4d0365c28aea9b7edb521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01da40c663b4d0365c28aea9b7edb521");
        } else {
            a(str, str2, str3, false);
        }
    }

    private synchronized void a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88c427f37332f0632ebb10950be407e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88c427f37332f0632ebb10950be407e1");
        } else {
            a(str, str2, str3, z, null);
        }
    }

    private synchronized void a(String str, String str2, String str3, boolean z, Map<String, String> map) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df784ab1164476fdfac31597ec24f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df784ab1164476fdfac31597ec24f0a");
            return;
        }
        if (this.b.containsKey(str2)) {
            this.b.get(str2).step(str3, map);
            if (z) {
                this.b.get(str2).commit();
                this.b.remove(str2);
            }
        } else {
            String b = c.b(str2);
            a.c cVar = new a.c(str + b);
            this.b.put(str2, cVar);
            cVar.step(str3, map);
            if (z) {
                cVar.commit();
                this.b.remove(str2);
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f14d3b4ef77e336729000a4dcc2d052", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f14d3b4ef77e336729000a4dcc2d052");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onBusinessStart | " + str);
        a(str);
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6fb2e25d096c5a3b49da7d2a072568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6fb2e25d096c5a3b49da7d2a072568");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onLoadStart | " + str);
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void a(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920c22ea74dc174218551e5c66b107fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920c22ea74dc174218551e5c66b107fa");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onLoadEnd | " + str + " | " + z);
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void c(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a30b21560ddd17fa3d5a1a079d16500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a30b21560ddd17fa3d5a1a079d16500");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onCalculateStart | " + str);
        a(a(i), str, "calculate_start");
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void d(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454ea9ef6231801b1dc351bad62018ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454ea9ef6231801b1dc351bad62018ac");
        } else if (this.c.containsKey(str)) {
            Integer num = this.c.get(str);
            String a2 = a(i);
            a(a2, str, "get_features_start_" + num);
            this.c.put(str, Integer.valueOf(num.intValue() + 1));
            com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onGetFeatureStart | " + str + " | count | " + num);
        } else {
            this.c.put(str, 2);
            a(a(i), str, "get_features_start_1");
            com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onGetFeatureStart | " + str + " | count | 1");
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void b(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ba59df3d2f496d20b04ed88995103d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ba59df3d2f496d20b04ed88995103d");
            return;
        }
        if (z && this.c.containsKey(str)) {
            Integer num = this.c.get(str);
            String a2 = a(i);
            a(a2, str, "get_features_end_" + (num.intValue() - 1));
            com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onGetFeatureEnd | " + str + " | count | " + (num.intValue() - 1));
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void e(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c0c3c9863cb35c8324e2a7867bfaf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c0c3c9863cb35c8324e2a7867bfaf6");
        } else if (this.d.containsKey(str)) {
            Integer num = this.d.get(str);
            String a2 = a(i);
            a(a2, str, "sql_query_start_" + num);
            this.d.put(str, Integer.valueOf(num.intValue() + 1));
            com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onSqlQueryStart | " + str + " | count | " + num);
        } else {
            this.d.put(str, 2);
            a(a(i), str, "sql_query_start_1");
            com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onSqlQueryStart | " + str + " | count | 1");
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void a(String str, int i, boolean z, Map<String, String> map) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf5852e51bcc42aaac2ae7936e2b270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf5852e51bcc42aaac2ae7936e2b270");
            return;
        }
        if (z && this.d.containsKey(str)) {
            Integer num = this.d.get(str);
            String a2 = a(i);
            a(a2, str, "sql_query_end_" + (num.intValue() - 1), false, map);
            com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onSqlQueryEnd | " + str + " | count | " + (num.intValue() - 1));
        }
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void c(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00006dc0940b81902552baa37837cfcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00006dc0940b81902552baa37837cfcd");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onCalculateEnd | " + str + " | " + z);
        if (z) {
            a(a(i), str, "calculate_end", true);
        }
        b(str);
        c(str);
    }

    @Override // com.sankuai.waimai.alita.core.engine.i
    public final synchronized void d(String str, int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e842dbef021002d6802c579e5abb41c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e842dbef021002d6802c579e5abb41c");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.b("AlitaPerfUploader onBusinessEnd | " + str + " | " + z);
    }
}
