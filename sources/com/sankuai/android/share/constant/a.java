package com.sankuai.android.share.constant;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    private static int a = 1;

    public static int a() {
        return a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.share.constant.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0540a {
        Unknown(0, "未知错误"),
        Data(1, "数据为空或类型不匹配"),
        Uninstalled(2, "未安装对应途径App"),
        NotSupportApi(3, "当前三方应用版本不支持api"),
        Cancelled(4, "用户主动取消分享"),
        FailedAwakeApp(5, "唤起三方App失败"),
        FailedShared(6, "调用三方平台SDK返回失败"),
        FailedApplyPermission(7, "请求系统隐私权限失败"),
        FailedApplyPrvicyAPI(8, "请求隐私SDK API返回失败"),
        ErrorFailedSystem(9, "短信、更多渠道唤起失败");
        
        public static ChangeQuickRedirect a;
        public int l;
        public String m;

        public static EnumC0540a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f99fce7519609823b459b75f71df560f", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0540a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f99fce7519609823b459b75f71df560f") : (EnumC0540a) Enum.valueOf(EnumC0540a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0540a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0893ef24c4d8df888df96e59f79c016a", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0540a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0893ef24c4d8df888df96e59f79c016a") : (EnumC0540a[]) values().clone();
        }

        EnumC0540a(int i, String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd9cece85c02d494dc40f59c79069a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd9cece85c02d494dc40f59c79069a1");
                return;
            }
            this.l = i;
            this.m = str;
        }
    }
}
