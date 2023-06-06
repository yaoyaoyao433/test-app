package com.meituan.msc.modules.viewmanager;

import android.support.annotation.Nullable;
import android.util.ArrayMap;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.ConversionUtil;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.uimanager.ap;
import com.meituan.msc.uimanager.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "UIConstantsManager")
/* loaded from: classes3.dex */
public class i extends k {
    public static ChangeQuickRedirect a;
    private av b;
    @Nullable
    private Map<String, WritableMap> c;
    private volatile int d;

    public i(av avVar) {
        Object[] objArr = {avVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "440af215adce0656a868e19b1e535251", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "440af215adce0656a868e19b1e535251");
            return;
        }
        this.b = avVar;
        this.c = new ArrayMap();
    }

    @Override // com.meituan.msc.modules.manager.k
    public final JSONObject N_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f30fef50d677ac9579fd12984793f5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f30fef50d677ac9579fd12984793f5b");
        }
        try {
            return ConversionUtil.parseJsonString(this.b.b.toString());
        } catch (Throwable th) {
            th.printStackTrace();
            com.meituan.msc.modules.reporter.g.a("[UIConstantsManagerModule@getConstants]", th);
            return super.N_();
        }
    }

    @MSCMethod(isSync = true)
    @Nullable
    public JSONObject getConstantsForViewManager(@Nullable String str) {
        WritableMap writableMap;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9512c763344000d4c6a6f75e384561", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9512c763344000d4c6a6f75e384561");
        }
        try {
            if (this.c != null && this.c.containsKey(str)) {
                writableMap = this.c.get(str);
                int i = this.d - 1;
                this.d = i;
                if (i <= 0) {
                    this.c = null;
                }
            } else {
                WritableMap b = this.b.b(str);
                this.c.put(str, b);
                this.d = this.c.size();
                writableMap = b;
            }
            return ConversionUtil.parseJsonString(ConversionUtil.toMap(writableMap).toString());
        } catch (Throwable th) {
            th.printStackTrace();
            com.meituan.msc.modules.reporter.g.a("[UIConstantsManagerModule@getConstantsForViewManager]", th);
            return new JSONObject();
        }
    }

    @MSCMethod(isSync = true)
    public JSONObject getDefaultEventTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df03dd809a3da444f751f4d8dd0d2722", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df03dd809a3da444f751f4d8dd0d2722");
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = av.a;
            return ConversionUtil.parseJsonString(ConversionUtil.toMap(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea66f77e68fb370e9c197608010c3e76", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea66f77e68fb370e9c197608010c3e76") : Arguments.makeNativeMap(ap.a())).toString());
        } catch (Throwable th) {
            th.printStackTrace();
            com.meituan.msc.modules.reporter.g.a("[UIConstantsManagerModule@getDefaultEventTypes]", th);
            return new JSONObject();
        }
    }

    @MSCMethod(isSync = true)
    public JSONObject lazilyLoadView(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae26eb742020dfccb03380f78147d388", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae26eb742020dfccb03380f78147d388") : new JSONObject();
    }
}
