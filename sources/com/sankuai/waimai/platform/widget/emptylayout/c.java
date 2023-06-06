package com.sankuai.waimai.platform.widget.emptylayout;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.utils.l;
import java.util.Random;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(Throwable th) {
        int i;
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13f9499ce1a22b8df1d382df537da960", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13f9499ce1a22b8df1d382df537da960");
        }
        StringBuilder sb = new StringBuilder();
        if (!NetWorkUtils.isNetworkConnected(com.meituan.android.singleton.b.a)) {
            sb.append("N#10000");
        } else {
            boolean z = th instanceof com.sankuai.waimai.platform.modular.network.error.a;
            if (z) {
                com.sankuai.waimai.platform.modular.network.error.a aVar = (com.sankuai.waimai.platform.modular.network.error.a) th;
                if (aVar.d() instanceof com.sankuai.meituan.retrofit2.exception.c) {
                    sb.append("H#");
                    sb.append(((com.sankuai.meituan.retrofit2.exception.c) aVar.d()).a());
                }
            }
            if (z) {
                com.sankuai.waimai.platform.modular.network.error.a aVar2 = (com.sankuai.waimai.platform.modular.network.error.a) th;
                if (aVar2.b() != 0) {
                    sb.append("B#");
                    sb.append(aVar2.b());
                }
            }
            if ((th != null && (th.getCause() instanceof JsonSyntaxException)) || (th != null && (th.getCause() instanceof JSONException))) {
                sb.append("B#-997");
            } else if (th != null && th.getMessage() != null && th.getMessage().matches("^BlockedServerException.*")) {
                String message = th.getMessage();
                int indexOf = message.indexOf(CommonConstant.Symbol.COLON);
                if (indexOf != -1 && (i = indexOf + 1) < message.length()) {
                    sb.append(message.substring(i));
                } else {
                    sb.append("H#");
                    sb.append(1001);
                }
            } else if (th != null) {
                sb.append("B#");
                sb.append(-1);
            }
        }
        return sb.toString();
    }

    public static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ce5c63d10c5bea96d0a7bbd35dcbdc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ce5c63d10c5bea96d0a7bbd35dcbdc4");
        }
        if (th instanceof com.sankuai.meituan.retrofit2.exception.c) {
            Response<?> b = ((com.sankuai.meituan.retrofit2.exception.c) th).b();
            return com.sankuai.waimai.platform.capacity.log.d.a().a(b == null ? "" : b.a());
        } else if (!(th instanceof com.sankuai.waimai.platform.modular.network.error.a)) {
            if (th instanceof a) {
                a aVar = (a) th;
                if (TextUtils.isEmpty(aVar.b)) {
                    return !(aVar.c instanceof a) ? b(aVar.c) : "";
                }
                return aVar.b;
            }
            return "";
        } else {
            return ((com.sankuai.waimai.platform.modular.network.error.a) th).c;
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38d4f113e37026f8c4f3b81fd77a1bae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38d4f113e37026f8c4f3b81fd77a1bae");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return !TextUtils.isEmpty(str) ? str : !TextUtils.isEmpty(str2) ? str2 : "";
        }
        return str + str2;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "603794725fd9347e364bf75c05fd8d89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "603794725fd9347e364bf75c05fd8d89");
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append("12345689ABCDEGHJKLMNPQRSTUVWXYZ".charAt(random.nextInt("12345689ABCDEGHJKLMNPQRSTUVWXYZ".length())));
        }
        return sb.toString();
    }

    public static void a(@NonNull final String str, final String str2, final String str3, final b bVar) {
        Object[] objArr = {str, str2, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff021cb451501747ffa2a4b62949fe9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff021cb451501747ffa2a4b62949fe9b");
        } else {
            l.a(new l.a() { // from class: com.sankuai.waimai.platform.widget.emptylayout.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c6a0906ca7f609e3c0456bce47c5778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c6a0906ca7f609e3c0456bce47c5778");
                        return;
                    }
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    b bVar2 = bVar;
                    Object[] objArr3 = {str4, str5, str6, bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    String str7 = null;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c7646636208da093b384f0273245cbab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c7646636208da093b384f0273245cbab");
                    } else if (TextUtils.isEmpty(str5)) {
                    } else {
                        if (bVar2 == null) {
                            bVar2 = new b(true);
                        }
                        com.sankuai.waimai.platform.capacity.log.e eVar = bVar2.b;
                        if (bVar2.b == null) {
                            str7 = c.b(bVar2.a);
                            if (!TextUtils.isEmpty(str7)) {
                                eVar = com.sankuai.waimai.platform.capacity.log.f.a().a(str7);
                            }
                        }
                        if (bVar2.c) {
                            String a2 = c.a(eVar, str7);
                            if (TextUtils.isEmpty(str4)) {
                                str4 = "PageError";
                            }
                            a.AbstractC1040a b = new e().a(str4).b(str5);
                            com.sankuai.waimai.platform.capacity.log.i.d(b.c(str4 + CommonConstant.Symbol.UNDERLINE + str6).d(a2).b());
                        }
                    }
                }
            }, (String) null);
        }
    }

    public static String a(com.sankuai.waimai.platform.capacity.log.e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3e0f70b56d68d6c7bda0fd5eb2d087b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3e0f70b56d68d6c7bda0fd5eb2d087b");
        }
        StringBuilder sb = new StringBuilder();
        if (eVar != null) {
            sb.append("request:[url:");
            sb.append(eVar.c);
            sb.append(",body:");
            sb.append(eVar.e);
            sb.append("],response[code:");
            sb.append(eVar.f);
            sb.append(",body:");
            sb.append(eVar.d);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        } else if (!TextUtils.isEmpty(str)) {
            sb.append("url:");
            sb.append(str);
        }
        return sb.toString();
    }
}
