package com.meituan.msc.common.process.ipc.provider;

import com.android.meituan.multiprocess.IPCBaseContentProvider;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MSCIPCProvider extends IPCBaseContentProvider {
    public static ChangeQuickRedirect a;
    private boolean b;

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public String getChannel() {
        return ContainerInfo.ENV_MSC;
    }

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public int getWaitInitTimeOut() {
        return -1;
    }

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public boolean startAfterInit() {
        return true;
    }

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public String getProcessName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b234df52ce5f632799c2318b37049592", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b234df52ce5f632799c2318b37049592") : ProcessUtils.getCurrentProcessName();
    }

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public void prepareForCall() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c642e31926c7f2538682e643bdccbe28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c642e31926c7f2538682e643bdccbe28");
        } else if (this.b) {
        } else {
            this.b = true;
            g.d("MSCIPCProvider", "prepareForCall");
            MSCEnvHelper.startHostInit(getContext());
            MSCEnvHelper.ensureFullInited();
        }
    }
}
