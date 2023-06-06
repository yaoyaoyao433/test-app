package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Config {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public List<String> blackList;
    @Expose
    public boolean enable;
    @Expose
    public List<String> whiteList;
    @Expose
    public Access access = new Access();
    @Expose
    public Bridge bridge = new Bridge();
    @Expose
    public Cache cache = new Cache();
    @Expose
    public Deploy deploy = new Deploy();
    @Expose
    public Inject inject = new Inject();
    @Expose
    public Report report = new Report();
    @Expose
    public Scheme scheme = new Scheme();
    @Expose
    public Plugin plugin = new Plugin();
    @Expose
    public Switch switcher = new Switch();
}
