package com.meituan.network.websocket;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IWebSocketApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiContext msiContext, SocketCloseParam socketCloseParam, String str);

    public abstract void a(MsiContext msiContext, SocketConnectParam socketConnectParam);

    public abstract void a(MsiContext msiContext, SocketSendParam socketSendParam, String str);

    @MsiApiMethod(isCallback = true, name = "onSocketOpen", response = SocketOpenEvent.class)
    public void msiOnSocketOpen(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onClose", response = SocketCloseEvent.class)
    public void onClose(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onError", response = SocketErrorEvent.class)
    public void onError(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onMessage", response = SocketMessageEvent.class)
    public void onMessage(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onOpen", response = SocketOpenEvent.class)
    public void onOpen(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketClose", response = SocketCloseEvent.class)
    public void onSocketClose(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketError", response = SocketErrorEvent.class)
    public void onSocketError(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketMessage", response = SocketMessageEvent.class)
    public void onSocketMessage(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "SocketTask")
    public EmptyResponse msiSocketTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "sendSocketMessage", request = SocketSendParam.class)
    public void sendSocketMessage(SocketSendParam socketSendParam, MsiContext msiContext) {
        Object[] objArr = {socketSendParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab5aebb0e19b2598b784dbc86ba59ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab5aebb0e19b2598b784dbc86ba59ff");
        } else {
            a(msiContext, socketSendParam, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }

    @MsiApiMethod(name = "connectSocket", request = SocketConnectParam.class)
    public void msiConnectSocket(SocketConnectParam socketConnectParam, MsiContext msiContext) {
        Object[] objArr = {socketConnectParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1ebf5d429fb4a3d01ea2484328072b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1ebf5d429fb4a3d01ea2484328072b");
        } else {
            a(msiContext, socketConnectParam);
        }
    }

    @MsiApiMethod(name = "closeSocket", request = SocketCloseParam.class)
    public void msiCloseSocket(SocketCloseParam socketCloseParam, MsiContext msiContext) {
        Object[] objArr = {socketCloseParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409da487e439e6b9309b7a046b528503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409da487e439e6b9309b7a046b528503");
        } else {
            a(msiContext, socketCloseParam, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }

    @MsiApiMethod(name = "SocketTask.close", request = SocketCloseParam.class)
    public void close(SocketCloseParam socketCloseParam, MsiContext msiContext) {
        Object[] objArr = {socketCloseParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6575d2d0797a4350592cde876132c22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6575d2d0797a4350592cde876132c22");
        } else {
            a(msiContext, socketCloseParam, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }

    @MsiApiMethod(name = "SocketTask.send", request = SocketSendParam.class)
    public void msiSocketSend(SocketSendParam socketSendParam, MsiContext msiContext) {
        Object[] objArr = {socketSendParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81a69cbafa695a75a2e5613b4a94f186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81a69cbafa695a75a2e5613b4a94f186");
        } else {
            a(msiContext, socketSendParam, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
        }
    }
}
