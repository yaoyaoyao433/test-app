package com.sankuai.titans.adapter.base.observers.tail;

import android.content.Context;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.protocol.context.ITitansContainerContext;
import com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TailContainerLifeCycle extends ContainerLifeCycleAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ActionMode.Callback actionModeCallback;

    public TailContainerLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c02d89e91ff4c497b5f39b472afdbaa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c02d89e91ff4c497b5f39b472afdbaa");
        } else {
            this.actionModeCallback = new ActionMode.Callback() { // from class: com.sankuai.titans.adapter.base.observers.tail.TailContainerLifeCycle.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.ActionMode.Callback
                public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode) {
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                    return false;
                }
            };
        }
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ContainerLifeCycleAdapter, com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle
    public void onContainerCreated(ITitansContainerContext iTitansContainerContext) {
        Object[] objArr = {iTitansContainerContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92beac568412feee1dc5fb28b85dd237", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92beac568412feee1dc5fb28b85dd237");
        } else if (disableActionMode(iTitansContainerContext.getActivity())) {
            iTitansContainerContext.setActionModeCallback(this.actionModeCallback);
        }
    }

    private boolean disableActionMode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1f69eeb07314eec3e9f38020481edc6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1f69eeb07314eec3e9f38020481edc6")).booleanValue();
        }
        List<String> webActionBlack = ConfigManager.getConfig().access.getWebActionBlack();
        return webActionBlack != null && Build.VERSION.SDK_INT >= 28 && webActionBlack.contains(context.getClass().getName());
    }
}
