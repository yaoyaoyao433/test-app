package com.meituan.android.common.sniffer.bean;

import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Message {
    private List<String> activeTrack;
    private String business;
    private transient Object[] currentArgs;
    private Map<String, String> customFieldMap;
    private String describe;
    private Map<String, Object> exts;
    private List<String> fullTrack;
    private boolean isWrong;
    private String log;
    private String methodNumber;
    private String module;
    private String pageName;
    private long traceTime;
    private String type;
    private long weight;

    public boolean isWrong() {
        return this.isWrong;
    }

    public void setWrong(boolean z) {
        this.isWrong = z;
    }

    public String getMethodNumber() {
        return this.methodNumber;
    }

    public void setMethodNumber(String str) {
        this.methodNumber = str;
    }

    public long getTraceTime() {
        return this.traceTime;
    }

    public void setTraceTime(long j) {
        this.traceTime = j;
    }

    public String getBusiness() {
        return this.business;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String str) {
        this.describe = str;
    }

    public Object[] getCurrentArgs() {
        return this.currentArgs;
    }

    public void setCurrentArgs(Object[] objArr) {
        this.currentArgs = objArr;
    }

    public List<String> getActiveTrack() {
        return this.activeTrack;
    }

    public void setActiveTrack(List<String> list) {
        this.activeTrack = list;
    }

    public List<String> getFullTrack() {
        return this.fullTrack;
    }

    public void setFullTrack(List<String> list) {
        this.fullTrack = list;
    }

    public String getLog() {
        return this.log;
    }

    public void setLog(String str) {
        this.log = str;
    }

    public Map<String, Object> getExts() {
        return this.exts;
    }

    public void setExts(Map<String, Object> map) {
        this.exts = map;
    }

    public long getWeight() {
        return this.weight;
    }

    public void setWeight(long j) {
        this.weight = j;
    }

    public void setCustomFieldMap(Map<String, String> map) {
        this.customFieldMap = map;
    }

    public Map<String, String> getCustomFieldMap() {
        return this.customFieldMap;
    }
}
