package com.sankuai.meituan.mtlive.mtrtc.library;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.mtlive.mtrtc.library.c;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void onAudioEffectFinished(int i, int i2) {
    }

    public void onAudioRouteChanged(int i, int i2) {
    }

    public void onCameraDidReady() {
    }

    public void onConnectOtherRoom(String str, int i, String str2) {
    }

    public void onConnectionLost() {
    }

    public void onConnectionRecovery() {
    }

    public void onDisConnectOtherRoom(int i, String str) {
    }

    public void onEnterRoom(long j) {
    }

    public void onError(int i, String str, Bundle bundle) {
    }

    public void onExitRoom(int i) {
    }

    public void onFirstAudioFrame(String str) {
    }

    public void onFirstVideoFrame(String str, int i, int i2, int i3) {
    }

    public void onMicDidReady() {
    }

    public void onMissCustomCmdMsg(String str, int i, int i2, int i3) {
    }

    public void onNetworkQuality(c.C0611c c0611c, ArrayList<c.C0611c> arrayList) {
    }

    public void onRecvCustomCmdMsg(String str, int i, int i2, byte[] bArr) {
    }

    public void onRecvSEIMsg(String str, byte[] bArr) {
    }

    public void onRemoteUserEnterRoom(String str) {
    }

    public void onRemoteUserLeaveRoom(String str, int i) {
    }

    public void onScreenCapturePaused() {
    }

    public void onScreenCaptureResumed() {
    }

    public void onScreenCaptureStarted() {
    }

    public void onScreenCaptureStopped(int i) {
    }

    public void onSendFirstLocalAudioFrame() {
    }

    public void onSendFirstLocalVideoFrame(int i) {
    }

    public void onSetMixTranscodingConfig(int i, String str) {
    }

    public void onSpeedTest(c.d dVar, int i, int i2) {
    }

    public void onStartPublishCDNStream(int i, String str) {
    }

    public void onStartPublishing(int i, String str) {
    }

    public void onStatistics(g gVar) {
    }

    public void onStopPublishCDNStream(int i, String str) {
    }

    public void onStopPublishing(int i, String str) {
    }

    public void onSwitchRole(int i, String str) {
    }

    public void onTryToReconnect() {
    }

    public void onUserAudioAvailable(String str, boolean z) {
    }

    public void onUserSubStreamAvailable(String str, boolean z) {
    }

    public void onUserVideoAvailable(String str, boolean z) {
    }

    public void onUserVoiceVolume(ArrayList<c.f> arrayList, int i) {
    }

    public void onWarning(int i, String str, Bundle bundle) {
    }
}
