package com.meituan.mmp.lib.api.network;

import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.storage.StorageModule;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RequestPrefetchApi extends ServiceApi {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.engine.a h;

    public RequestPrefetchApi(com.meituan.mmp.lib.engine.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8241b7fbc77c5d546aeff33149e86b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8241b7fbc77c5d546aeff33149e86b8");
        } else {
            this.h = aVar;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6939b7e398d79c2f68fc9fc62999c2cb", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6939b7e398d79c2f68fc9fc62999c2cb") : new String[]{"setBackgroundFetchToken", "getBackgroundFetchDataSync", "getBackgroundFetchData"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88984b611c57747b6f6fc75370c39659", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88984b611c57747b6f6fc75370c39659")).booleanValue();
        }
        if ("getBackgroundFetchDataSync".equals(str)) {
            return true;
        }
        return super.c(str);
    }

    public static String a(com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ed5c16e6219885ef006e5f069be9bff", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ed5c16e6219885ef006e5f069be9bff") : MMPEnvHelper.getSharedPreferences(b(aVar)).getString("request_prefetch_token", null);
    }

    private static String b(com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e34ace4e00dca7fd5d4a317d307d88b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e34ace4e00dca7fd5d4a317d307d88b");
        }
        return StorageModule.a(aVar) + "_prefetch";
    }

    private void a(Event event, IApiCallback iApiCallback, boolean z) {
        Object[] objArr = {event, iApiCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc6e0b6b82d4ee052e246393431f58c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc6e0b6b82d4ee052e246393431f58c");
            return;
        }
        String optString = event.a().optString("fetchType");
        if ("pre".equals(optString)) {
            this.h.b.k.a(iApiCallback, !z ? 1 : 0);
            return;
        }
        iApiCallback.onFail(codeJson(-1, "fetchType + " + optString + " not supported"));
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(Event event, IApiCallback iApiCallback) throws com.meituan.mmp.lib.api.d {
        Object[] objArr = {event, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "074f525e893718098c485698624b8fbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "074f525e893718098c485698624b8fbb");
            return;
        }
        String str = event.b;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -344963205) {
            if (hashCode != 865788591) {
                if (hashCode == 1208162496 && str.equals("getBackgroundFetchData")) {
                    c = 2;
                }
            } else if (str.equals("setBackgroundFetchToken")) {
                c = 0;
            }
        } else if (str.equals("getBackgroundFetchDataSync")) {
            c = 1;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {event, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91a26f75344d5afc3cb0f765b1c54e69", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91a26f75344d5afc3cb0f765b1c54e69");
                    return;
                }
                getSharedPreferences(b(getAppConfig())).edit().putString("request_prefetch_token", event.a().optString("token")).apply();
                iApiCallback.onSuccess(null);
                return;
            case 1:
                a(event, iApiCallback, true);
                return;
            case 2:
                a(event, iApiCallback, false);
                return;
            default:
                return;
        }
    }
}
