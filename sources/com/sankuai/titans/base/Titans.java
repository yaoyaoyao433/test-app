package com.sankuai.titans.base;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import android.system.Os;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.titans.base.observer.EventRegisterPlugin;
import com.sankuai.titans.protocol.adaptor.IAppTitansPlugin;
import com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.services.IServiceManager;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.AccessTimingInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleInfo;
import com.sankuai.titans.protocol.services.statisticInfo.LifeCycleType;
import com.sankuai.titans.protocol.services.statisticInfo.PluginErrorInfo;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Titans {
    private static ITitansAppAdaptor appAdaptor;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static EventRegisterPlugin eventRegisterPlugin;
    private static final AtomicBoolean isInitiated = new AtomicBoolean(false);
    private static ITitansContext titansContext;

    public static boolean hasInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a12524ea307cde4b9cd540a04364932", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a12524ea307cde4b9cd540a04364932")).booleanValue() : isInitiated.get() && appAdaptor != null;
    }

    public static synchronized void init(Context context, final ITitansAppAdaptor iTitansAppAdaptor) {
        synchronized (Titans.class) {
            Object[] objArr = {context, iTitansAppAdaptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b3ed469303e37d9b99cb6225480f45de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b3ed469303e37d9b99cb6225480f45de");
            } else if (context == null) {
                throw new RuntimeException("init titans,context must not null");
            } else {
                if (iTitansAppAdaptor == null) {
                    throw new RuntimeException("init titans, 没有实现适配层");
                }
                if (hasInit()) {
                    return;
                }
                AccessTimingInfo accessTimingInfo = new AccessTimingInfo("20.14.1");
                accessTimingInfo.startPoint("onTitansStart", System.currentTimeMillis());
                IServiceManager serviceManager = iTitansAppAdaptor.getServiceManager();
                final IStatisticsService statisticsService = serviceManager.getStatisticsService();
                Context applicationContext = context.getApplicationContext();
                b.a(applicationContext, (b.a) null);
                appAdaptor = iTitansAppAdaptor;
                titansContext = new TitansContext(applicationContext, iTitansAppAdaptor.getAppInfo(), iTitansAppAdaptor.getServiceManager(), new JsHostCenter());
                try {
                    applicationContext.registerReceiver(new BroadcastReceiver() { // from class: com.sankuai.titans.base.Titans.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context2, Intent intent) {
                            DownloadManager downloadManager;
                            Cursor cursor;
                            Uri uriForFile;
                            Object[] objArr2 = {context2, intent};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b50b8407d546fb217a1bfc93e659bb9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b50b8407d546fb217a1bfc93e659bb9");
                                return;
                            }
                            try {
                                if (!"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction()) || (downloadManager = (DownloadManager) context2.getSystemService("download")) == null) {
                                    return;
                                }
                                long a = f.a(intent, "extra_download_id", -1L);
                                if (a == -1) {
                                    return;
                                }
                                String str = null;
                                try {
                                    cursor = downloadManager.query(new DownloadManager.Query().setFilterById(a));
                                    if (cursor == null) {
                                        if (cursor != null) {
                                            cursor.close();
                                            return;
                                        }
                                        return;
                                    }
                                    try {
                                        if (cursor.moveToFirst()) {
                                            if (8 != cursor.getInt(cursor.getColumnIndex("status"))) {
                                                if (cursor != null) {
                                                    cursor.close();
                                                    return;
                                                }
                                                return;
                                            } else if (Build.VERSION.SDK_INT < 24) {
                                                str = cursor.getString(cursor.getColumnIndex("local_filename"));
                                            }
                                        }
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        Intent intent2 = new Intent();
                                        intent2.addFlags(y.a);
                                        intent2.setAction("android.intent.action.VIEW");
                                        if (Build.VERSION.SDK_INT < 24) {
                                            uriForFile = Uri.fromFile(new File(str));
                                        } else {
                                            intent2.addFlags(1);
                                            str = Os.readlink("/proc/self/fd/" + downloadManager.openDownloadedFile(a).getFd());
                                            uriForFile = FileProvider.getUriForFile(context2, context2.getPackageName() + ".kfp", new File(str));
                                        }
                                        String mimeTypeForDownloadedFile = downloadManager.getMimeTypeForDownloadedFile(a);
                                        if ("application/octet-stream".equalsIgnoreCase(mimeTypeForDownloadedFile)) {
                                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                                            if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
                                                mimeTypeForDownloadedFile = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                                                if (TextUtils.isEmpty(mimeTypeForDownloadedFile)) {
                                                    return;
                                                }
                                            }
                                        }
                                        if ("application/vnd.android.package-archive".equalsIgnoreCase(mimeTypeForDownloadedFile)) {
                                            intent2.setAction("android.intent.action.INSTALL_PACKAGE");
                                        }
                                        intent2.setDataAndType(uriForFile, mimeTypeForDownloadedFile);
                                        context2.startActivity(intent2);
                                    } catch (Throwable th) {
                                        th = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = null;
                                }
                            } catch (Throwable th3) {
                                ITitansAppAdaptor.this.getServiceManager().getStatisticsService().reportClassError(TitansConstants.BridgeConstants.SOURCE_TITANS, "init", th3);
                            }
                        }
                    }, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                    eventRegisterPlugin = new EventRegisterPlugin();
                    serviceManager.getThreadPoolService().executeOnThreadPool("Titans:onTitansReady", new Runnable() { // from class: com.sankuai.titans.base.Titans.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7fa0ba199217eb3115bf96b25b008070", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7fa0ba199217eb3115bf96b25b008070");
                                return;
                            }
                            LifeCycleInfo lifeCycleInfo = new LifeCycleInfo("$all", "20.14.1", "20.14.1", LifeCycleType.Titans, "onTitansReady");
                            lifeCycleInfo.setStartTime(System.currentTimeMillis());
                            for (ITitansPlugin iTitansPlugin : Titans.getPlugins()) {
                                if (iTitansPlugin != null) {
                                    TitansPlugin titansPlugin = (TitansPlugin) iTitansPlugin.getClass().getAnnotation(TitansPlugin.class);
                                    if (titansPlugin == null) {
                                        throw new RuntimeException("titans lifecycle plugin's annotation Titants's Plugin could not be null");
                                    }
                                    LifeCycleInfo lifeCycleInfo2 = new LifeCycleInfo(titansPlugin.name(), titansPlugin.version(), "20.14.1", LifeCycleType.Titans, "onTitansReady");
                                    try {
                                        lifeCycleInfo2.setStartTime(System.currentTimeMillis());
                                        iTitansPlugin.onTitansReady(Titans.titansContext);
                                        lifeCycleInfo2.setEndTime(System.currentTimeMillis());
                                        IStatisticsService.this.reportLifeCycleInfo(lifeCycleInfo2);
                                    } catch (Throwable th) {
                                        IStatisticsService.this.reportErrorInfo(new PluginErrorInfo(LifeCycleType.Titans, "onTitansReady", titansPlugin.name(), titansPlugin.version(), (String) null, th));
                                    }
                                }
                            }
                            lifeCycleInfo.setEndTime(System.currentTimeMillis());
                            IStatisticsService.this.reportLifeCycleInfo(lifeCycleInfo);
                        }
                    });
                    accessTimingInfo.endPoint("TitansCreate", System.currentTimeMillis() - accessTimingInfo.getDurationStartTime());
                    statisticsService.reportTimingInfo(accessTimingInfo);
                } catch (Exception unused) {
                }
                isInitiated.set(true);
            }
        }
    }

    public static ITitansAppAdaptor getAppAdaptor() {
        return appAdaptor;
    }

    public static List<ITitansPlugin> getPlugins() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "699a1f8a83c29f53740674d9597979b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "699a1f8a83c29f53740674d9597979b1");
        }
        IAppTitansPlugin appTitansPlugin = appAdaptor.getAppTitansPlugin();
        ArrayList arrayList = new ArrayList(appTitansPlugin.getTopPlugins());
        Map<String, ITitansPlugin> businessPlugins = appTitansPlugin.getBusinessPlugins();
        if (businessPlugins != null) {
            for (ITitansPlugin iTitansPlugin : businessPlugins.values()) {
                if (iTitansPlugin != null) {
                    arrayList.add(iTitansPlugin);
                }
            }
        }
        arrayList.addAll(appTitansPlugin.getTailPlugins());
        return arrayList;
    }

    public static ITitansContext getTitansContext() {
        return titansContext;
    }

    public static List<ITitansPlugin> getPlugins(String str, ITitansPlugin iTitansPlugin) {
        Object[] objArr = {str, iTitansPlugin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ITitansPlugin iTitansPlugin2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1791efe2a66b0e009dfb43c7ab3f02ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1791efe2a66b0e009dfb43c7ab3f02ed");
        }
        IAppTitansPlugin appTitansPlugin = appAdaptor.getAppTitansPlugin();
        ArrayList arrayList = new ArrayList(appTitansPlugin.getTopPlugins());
        Map<String, ITitansPlugin> businessPlugins = appTitansPlugin.getBusinessPlugins();
        if (businessPlugins != null && !TextUtils.isEmpty(str)) {
            iTitansPlugin2 = businessPlugins.get(str);
        }
        if (iTitansPlugin2 != null) {
            arrayList.add(iTitansPlugin2);
        }
        if (iTitansPlugin != null) {
            arrayList.add(iTitansPlugin);
        }
        arrayList.addAll(appTitansPlugin.getTailPlugins());
        arrayList.add(eventRegisterPlugin);
        return arrayList;
    }

    public static IServiceManager serviceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2a42e38628111cb96a2962c7e58759b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IServiceManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2a42e38628111cb96a2962c7e58759b");
        }
        if (appAdaptor != null) {
            return appAdaptor.getServiceManager();
        }
        throw new RuntimeException("Titans has not been initialized!");
    }
}
