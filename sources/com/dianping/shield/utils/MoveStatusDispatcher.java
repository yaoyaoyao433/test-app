package com.dianping.shield.utils;

import android.os.Handler;
import android.os.Message;
import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.MoveStatusAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MoveStatusDispatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MyHandler mStatusHandler;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class MyHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<MoveStatusDispatcher> dispatcherWeakReference;

        public MyHandler(MoveStatusDispatcher moveStatusDispatcher) {
            Object[] objArr = {moveStatusDispatcher};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe93d3b89436b2c7f4e49671ce3967a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe93d3b89436b2c7f4e49671ce3967a8");
            } else {
                this.dispatcherWeakReference = new WeakReference<>(moveStatusDispatcher);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8478578501415436c1303d689215dd3f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8478578501415436c1303d689215dd3f");
                return;
            }
            super.handleMessage(message);
            if (this.dispatcherWeakReference.get() == null || message.obj == null || !(message.obj instanceof MoveStatusAction)) {
                return;
            }
            MoveStatusAction moveStatusAction = (MoveStatusAction) message.obj;
            if (moveStatusAction.moveStatusInterface != null && moveStatusAction.isSCI) {
                if (moveStatusAction.isAppear) {
                    moveStatusAction.moveStatusInterface.onAppear(moveStatusAction.scope, moveStatusAction.direction);
                } else {
                    moveStatusAction.moveStatusInterface.onDisappear(moveStatusAction.scope, moveStatusAction.direction);
                }
            }
            if (moveStatusAction.cellMoveStatusInterface != null && moveStatusAction.cellType == CellType.NORMAL) {
                if (moveStatusAction.isAppear) {
                    moveStatusAction.cellMoveStatusInterface.onAppear(moveStatusAction.scope, moveStatusAction.direction, moveStatusAction.section, moveStatusAction.row);
                } else {
                    moveStatusAction.cellMoveStatusInterface.onDisappear(moveStatusAction.scope, moveStatusAction.direction, moveStatusAction.section, moveStatusAction.row);
                }
            }
            if (moveStatusAction.extraCellMoveStatusInterface == null || moveStatusAction.cellType == CellType.NORMAL) {
                return;
            }
            if (moveStatusAction.isAppear) {
                moveStatusAction.extraCellMoveStatusInterface.onAppear(moveStatusAction.scope, moveStatusAction.direction, moveStatusAction.section, moveStatusAction.cellType);
            } else {
                moveStatusAction.extraCellMoveStatusInterface.onDisappear(moveStatusAction.scope, moveStatusAction.direction, moveStatusAction.section, moveStatusAction.cellType);
            }
        }
    }

    public MoveStatusDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74d5d335f0ba46f1649430ee7b4cbced", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74d5d335f0ba46f1649430ee7b4cbced");
        } else {
            this.mStatusHandler = new MyHandler(this);
        }
    }

    public void moveAction(MoveStatusAction moveStatusAction) {
        Object[] objArr = {moveStatusAction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1faac590d09589890a3b7246e549d469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1faac590d09589890a3b7246e549d469");
        } else if (moveStatusAction != null) {
            if (moveStatusAction.moveStatusInterface == null && moveStatusAction.cellMoveStatusInterface == null && moveStatusAction.extraCellMoveStatusInterface == null) {
                return;
            }
            Message message = new Message();
            message.what = moveStatusAction.hashCode();
            message.obj = moveStatusAction;
            this.mStatusHandler.sendMessage(message);
        }
    }

    public void stopDispatch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37985bd2d89f15ba237b471f1c5a22c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37985bd2d89f15ba237b471f1c5a22c9");
        } else {
            this.mStatusHandler.removeCallbacksAndMessages(null);
        }
    }
}
