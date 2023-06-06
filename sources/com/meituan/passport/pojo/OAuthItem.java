package com.meituan.passport.pojo;

import android.graphics.drawable.StateListDrawable;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum OAuthItem {
    SAME_ACCOUNT_DEFAULT(UserCenter.OAUTH_TYPE_UNIQUE, "同账号", (int) R.drawable.passsport_third_login_default_icon),
    SAME_ACCOUNT(UserCenter.OAUTH_TYPE_UNIQUE, "同账号", new StateListDrawable()),
    PASSWORD_FREE(UserCenter.OAUTH_TYPE_CHINA_MOBILE, "免密码", R.drawable.passport_telephone_button_selecter, R.drawable.passport_chinamobile_button_selecter, R.drawable.passport_unicom_button_selecter),
    VERIFICATION_PASSWORD("verification_code/password", "验证码/密码", (int) R.drawable.passport_account_button_selecter),
    WEIXIN(UserCenter.OAUTH_TYPE_WEIXIN, "微信", (int) R.drawable.passport_weichat_button_selecter),
    QQ(UserCenter.OAUTH_TYPE_QQ, Constants.SOURCE_QQ, (int) R.drawable.passport_qq_button_selecter);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int imageRes;
    public StateListDrawable listDrawable;
    public int mobileRes;
    public String name;
    public int telephoneRes;
    public String type;
    public int unicomRes;

    public static OAuthItem valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99685cb54bb083d228ce8e103d9d6ce2", RobustBitConfig.DEFAULT_VALUE) ? (OAuthItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99685cb54bb083d228ce8e103d9d6ce2") : (OAuthItem) Enum.valueOf(OAuthItem.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OAuthItem[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e227fcba48e264e626d10468300b9bc", RobustBitConfig.DEFAULT_VALUE) ? (OAuthItem[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e227fcba48e264e626d10468300b9bc") : (OAuthItem[]) values().clone();
    }

    OAuthItem(String str, String str2, @DrawableRes int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62aef203288810cedac17bed0370b15e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62aef203288810cedac17bed0370b15e");
            return;
        }
        this.type = str;
        this.name = str2;
        this.imageRes = i;
    }

    OAuthItem(String str, String str2, StateListDrawable stateListDrawable) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, str2, stateListDrawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ede44f2bb7da1658c6548d6ff869814", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ede44f2bb7da1658c6548d6ff869814");
            return;
        }
        this.type = str;
        this.name = str2;
        this.listDrawable = stateListDrawable;
    }

    OAuthItem(String str, String str2, @DrawableRes int i, @DrawableRes int i2, @DrawableRes int i3) {
        Object[] objArr = {r15, Integer.valueOf(r16), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8897812705e355403f06d5a7767fa41c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8897812705e355403f06d5a7767fa41c");
            return;
        }
        this.type = str;
        this.name = str2;
        this.telephoneRes = i;
        this.mobileRes = i2;
        this.unicomRes = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r12.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_CHINA_MOBILE) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.passport.pojo.OAuthItem from(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.passport.pojo.OAuthItem.changeQuickRedirect
            java.lang.String r11 = "69a4f3c7becb9ab0cc03748c2a904836"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            com.meituan.passport.pojo.OAuthItem r12 = (com.meituan.passport.pojo.OAuthItem) r12
            return r12
        L1e:
            r1 = -1
            int r3 = r12.hashCode()
            switch(r3) {
                case -1474483372: goto L5d;
                case -1427573947: goto L52;
                case -791575966: goto L47;
                case -282778279: goto L3c;
                case 3616: goto L31;
                case 409238928: goto L27;
                default: goto L26;
            }
        L26:
            goto L68
        L27:
            java.lang.String r3 = "password_free"
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L68
            goto L69
        L31:
            java.lang.String r0 = "qq"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L68
            r0 = 5
            goto L69
        L3c:
            java.lang.String r0 = "verification_code/password"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L68
            r0 = 2
            goto L69
        L47:
            java.lang.String r0 = "weixin"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L68
            r0 = 3
            goto L69
        L52:
            java.lang.String r0 = "tencent"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L68
            r0 = 4
            goto L69
        L5d:
            java.lang.String r0 = "same_account"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L68
            r0 = 0
            goto L69
        L68:
            r0 = -1
        L69:
            switch(r0) {
                case 0: goto L79;
                case 1: goto L76;
                case 2: goto L73;
                case 3: goto L70;
                case 4: goto L6d;
                case 5: goto L6d;
                default: goto L6c;
            }
        L6c:
            return r2
        L6d:
            com.meituan.passport.pojo.OAuthItem r12 = com.meituan.passport.pojo.OAuthItem.QQ
            return r12
        L70:
            com.meituan.passport.pojo.OAuthItem r12 = com.meituan.passport.pojo.OAuthItem.WEIXIN
            return r12
        L73:
            com.meituan.passport.pojo.OAuthItem r12 = com.meituan.passport.pojo.OAuthItem.VERIFICATION_PASSWORD
            return r12
        L76:
            com.meituan.passport.pojo.OAuthItem r12 = com.meituan.passport.pojo.OAuthItem.PASSWORD_FREE
            return r12
        L79:
            com.meituan.passport.pojo.OAuthItem r12 = com.meituan.passport.pojo.OAuthItem.SAME_ACCOUNT_DEFAULT
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.pojo.OAuthItem.from(java.lang.String):com.meituan.passport.pojo.OAuthItem");
    }

    @Override // java.lang.Enum
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3efa7c06e785fc114148915e78104e42", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3efa7c06e785fc114148915e78104e42");
        }
        return "OAuthItem{type='" + this.type + "', name='" + this.name + "'}";
    }
}
