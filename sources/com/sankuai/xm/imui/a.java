package com.sankuai.xm.imui;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.lifecycle.d;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.api.e;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.message.handler.w;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.session.SessionFragment;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements IMClient.m {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
    public final void a(MediaMessage mediaMessage, int i) {
    }

    @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
    public void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a947eba596a69ba17b039a9e8ef4fafc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a947eba596a69ba17b039a9e8ef4fafc");
            return;
        }
        for (com.sankuai.xm.imui.session.listener.b bVar : b(iMMessage)) {
            bVar.c(iMMessage);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
    public void onFailure(IMMessage iMMessage, int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0667a152fe1854142cb0d8d3e51aa16a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0667a152fe1854142cb0d8d3e51aa16a");
            return;
        }
        for (com.sankuai.xm.imui.session.listener.b bVar : b(iMMessage)) {
            bVar.a(iMMessage, i);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
    public final void a(IMMessage iMMessage, int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e1e4f4dad82693fc6c720d717ecf204", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e1e4f4dad82693fc6c720d717ecf204");
            return;
        }
        for (com.sankuai.xm.imui.session.listener.b bVar : b(iMMessage)) {
            bVar.b(iMMessage, i);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
    public void onProgress(MediaMessage mediaMessage, double d, double d2) {
        Object[] objArr = {mediaMessage, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4acedb0eb772b9087cbaec6c962fe05f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4acedb0eb772b9087cbaec6c962fe05f");
            return;
        }
        for (com.sankuai.xm.imui.session.listener.b bVar : b(mediaMessage)) {
            bVar.a(mediaMessage, d, d2);
        }
    }

    private List<com.sankuai.xm.imui.session.listener.b> b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "968fcfe64b31aea7d8c1b3547b70f7ff", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "968fcfe64b31aea7d8c1b3547b70f7ff") : com.sankuai.xm.imui.listener.b.a().a(SessionId.a(iMMessage).f());
    }

    @Override // com.sankuai.xm.im.IMClient.m
    public final void a(IMMessage iMMessage, Callback<IMMessage> callback) {
        Object[] objArr = {iMMessage, callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b7df8921fde07ad10f250a404930707", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b7df8921fde07ad10f250a404930707");
            return;
        }
        if (iMMessage instanceof VideoMessage) {
            final VideoMessage videoMessage = (VideoMessage) iMMessage;
            if (videoMessage.getOperationType() == 5) {
                String screenshotPath = videoMessage.getScreenshotPath();
                if (ac.a(screenshotPath)) {
                    screenshotPath = w.a(videoMessage);
                    videoMessage.setScreenshotPath(screenshotPath);
                }
                if (!k.o(screenshotPath)) {
                    e eVar = (e) m.a(e.class);
                    if (eVar != null) {
                        eVar.a(videoMessage.getPath(), screenshotPath);
                        if (k.o(screenshotPath)) {
                            final SessionFragment a = com.sankuai.xm.imui.session.b.a((Context) d.d().b());
                            if (a != null && a.isVisible()) {
                                a.a(j.a(new Runnable() { // from class: com.sankuai.xm.imui.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr2 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect2 = a;
                                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "908660560229007fe6e52309c584a960", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "908660560229007fe6e52309c584a960");
                                        } else {
                                            a.b(videoMessage.getMsgUuid());
                                        }
                                    }
                                }));
                            }
                            com.sankuai.xm.base.callback.a.a(callback, iMMessage);
                            return;
                        }
                    }
                    com.sankuai.xm.base.callback.a.a(callback, 10018, "create thumb failed");
                    return;
                }
            }
        }
        com.sankuai.xm.base.callback.a.a(callback, iMMessage);
    }
}
