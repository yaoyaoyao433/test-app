package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UpdateBean implements Serializable {
    public boolean a;
    public String b;
    public int c;
    public String d;
    public String e;
    public ArrayList f;
    public boolean g = true;

    public static <T> T a(T t) {
        return t;
    }

    public String a() {
        return (String) a(this.d);
    }

    public String b() {
        return (String) a(this.b);
    }

    public int c() {
        return ((Integer) a(Integer.valueOf(this.c))).intValue();
    }

    public boolean d() {
        return ((Boolean) a(Boolean.valueOf(this.a))).booleanValue();
    }

    public String getClientAppName() {
        return (String) a(this.e);
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f);
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.g))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.d = str;
    }

    public void setClientAppName(String str) {
        this.e = str;
    }

    public void setClientPackageName(String str) {
        this.b = str;
    }

    public void setClientVersionCode(int i) {
        this.c = i;
    }

    public void setHmsOrApkUpgrade(boolean z) {
        this.a = z;
    }

    public void setNeedConfirm(boolean z) {
        this.g = z;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f = arrayList;
    }
}
