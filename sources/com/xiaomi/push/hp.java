package com.xiaomi.push;
/* loaded from: classes6.dex */
public enum hp {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    
    final int d;

    hp(int i) {
        this.d = i;
    }

    public static hp a(int i) {
        switch (i) {
            case 0:
                return RegIdExpired;
            case 1:
                return PackageUnregistered;
            case 2:
                return Init;
            default:
                return null;
        }
    }
}
