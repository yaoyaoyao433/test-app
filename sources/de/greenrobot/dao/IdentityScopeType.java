package de.greenrobot.dao;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum IdentityScopeType {
    Session,
    None;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static IdentityScopeType[] valuesCustom() {
        IdentityScopeType[] valuesCustom = values();
        int length = valuesCustom.length;
        IdentityScopeType[] identityScopeTypeArr = new IdentityScopeType[length];
        System.arraycopy(valuesCustom, 0, identityScopeTypeArr, 0, length);
        return identityScopeTypeArr;
    }
}
