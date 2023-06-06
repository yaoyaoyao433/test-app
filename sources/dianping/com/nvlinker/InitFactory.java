package dianping.com.nvlinker;

import android.content.Context;
import dianping.com.nvlinker.stub.ILuban;
import dianping.com.nvlinker.stub.IMonitorService;
import dianping.com.nvlinker.stub.IQuakerbird;
import dianping.com.nvlinker.stub.IRequestBuilder;
import dianping.com.nvlinker.stub.ISharkService;
import dianping.com.nvlinker.util.ReflectionHelper;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class InitFactory {
    private volatile IMonitorService monitorService;

    public ISharkService getSharkService() {
        if (NVLinker.getContext() != null) {
            try {
                if (ReflectionHelper.getObj("com.dianping.nvnetwork.NVDefaultNetworkService", new Class[]{Context.class}, new Object[]{NVLinker.getContext()}) != null) {
                    return (ISharkService) ReflectionHelper.instance("com.dianping.nvnetwork.NVDefaultNetworkService", "obtain");
                }
                return null;
            } catch (Throwable th) {
                String.valueOf(th.getMessage());
                return null;
            }
        }
        return null;
    }

    public IRequestBuilder getReqBuilder() {
        try {
            Object obj = ReflectionHelper.getObj("com.dianping.nvnetwork.Request$Builder", null, null);
            if (obj != null) {
                return (IRequestBuilder) obj;
            }
            return null;
        } catch (Throwable th) {
            String.valueOf(th.getMessage());
            return null;
        }
    }

    public ILuban getLubanService() {
        try {
            return (ILuban) ReflectionHelper.instance("com.dianping.luban.LubanService", "obtain");
        } catch (Throwable th) {
            String.valueOf(th.getMessage());
            return null;
        }
    }

    public IQuakerbird getQBService() {
        try {
            return (IQuakerbird) ReflectionHelper.instance("com.dianping.quakerbird.QBService", "obtain");
        } catch (Throwable th) {
            String.valueOf(th.getMessage());
            return null;
        }
    }

    public URL obtainUrl(String str) throws MalformedURLException {
        if (getSharkService() != null) {
            try {
                return new URL((URL) null, str, new NVURLStream());
            } catch (MalformedURLException e) {
                String.valueOf(e.getMessage());
            }
        }
        return new URL(str);
    }

    public void registerMonitor(IMonitorService iMonitorService) {
        this.monitorService = iMonitorService;
    }

    public IMonitorService getMonitor() {
        return this.monitorService;
    }
}
