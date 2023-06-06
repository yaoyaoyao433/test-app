package com.meituan.mmp.lib.mp.ipc.provider;

import com.android.meituan.multiprocess.IPCBaseContentProvider;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MMPIPCProvider extends IPCBaseContentProvider {
    public static ChangeQuickRedirect a;
    private boolean b;

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public String getChannel() {
        return ContainerInfo.ENV_MMP;
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512a3fdad28824fbb5eab03e90ba472c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512a3fdad28824fbb5eab03e90ba472c") : ProcessUtils.getCurrentProcessName();
    }

    @Override // com.android.meituan.multiprocess.IPCBaseContentProvider
    public void prepareForCall() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add578b60009cebe8e57ebfceb3a1e92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add578b60009cebe8e57ebfceb3a1e92");
        } else if (this.b) {
        } else {
            this.b = true;
            b.a.a("MMPIPCProvider", "prepareForCall");
            MMPEnvHelper.startHostInit(getContext());
            MMPEnvHelper.ensureFullInited();
        }
    }
}
