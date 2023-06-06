package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* loaded from: classes6.dex */
public final class gb implements gg {
    String a;
    String b;
    private String c;
    private String[] d;
    private String[] e;
    private List<gb> f;

    public gb(String str, String str2, String[] strArr, String[] strArr2) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = str;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public gb(String str, String str2, String[] strArr, String[] strArr2, String str3, List<gb> list) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = str;
        this.c = str2;
        this.d = strArr;
        this.e = strArr2;
        this.b = str3;
        this.f = list;
    }

    public static gb a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> keySet = bundle2.keySet();
        String[] strArr = new String[keySet.size()];
        String[] strArr2 = new String[keySet.size()];
        int i = 0;
        for (String str : keySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new gb(string, string2, strArr, strArr2, string3, arrayList);
    }

    public final String a() {
        return !TextUtils.isEmpty(this.b) ? gq.b(this.b) : this.b;
    }

    public final String a(String str) {
        if (this.d != null) {
            for (int i = 0; i < this.d.length; i++) {
                if (str.equals(this.d[i])) {
                    return this.e[i];
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.xiaomi.push.gg
    public final String b() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.c)) {
            sb.append(" xmlns=");
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            sb.append(this.c);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                if (!TextUtils.isEmpty(this.e[i])) {
                    sb.append(StringUtil.SPACE);
                    sb.append(this.d[i]);
                    sb.append("=\"");
                    sb.append(gq.a(this.e[i]));
                    sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                }
            }
        }
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(">");
            sb.append(this.b);
        } else if (this.f == null || this.f.size() <= 0) {
            str = "/>";
            sb.append(str);
            return sb.toString();
        } else {
            sb.append(">");
            for (gb gbVar : this.f) {
                sb.append(gbVar.b());
            }
        }
        sb.append("</");
        sb.append(this.a);
        str = ">";
        sb.append(str);
        return sb.toString();
    }

    public final String toString() {
        return b();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.a);
        bundle.putString("ext_ns", this.c);
        bundle.putString("ext_text", this.b);
        Bundle bundle2 = new Bundle();
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                bundle2.putString(this.d[i], this.e[i]);
            }
        }
        bundle.putBundle("attributes", bundle2);
        if (this.f != null && this.f.size() > 0) {
            List<gb> list = this.f;
            bundle.putParcelableArray("children", a((gb[]) list.toArray(new gb[list.size()])));
        }
        return bundle;
    }

    private static Parcelable[] a(gb[] gbVarArr) {
        if (gbVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[gbVarArr.length];
        for (int i = 0; i < gbVarArr.length; i++) {
            parcelableArr[i] = gbVarArr[i].c();
        }
        return parcelableArr;
    }
}
