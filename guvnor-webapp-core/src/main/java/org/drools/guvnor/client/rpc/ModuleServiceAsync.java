/*
 * Copyright 2011 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.guvnor.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ModuleServiceAsync {
    /** PLACE THE FOLLOWING IN PackageServiceAsync.java **/

    /** Generated by AsyncInterfaceGenerator hackery */
    public void listModules(java.lang.String p0, AsyncCallback<org.drools.guvnor.client.rpc.Module[]> cb);
    public void listModules(AsyncCallback<org.drools.guvnor.client.rpc.Module[]> cb);
    public void listArchivedModules(AsyncCallback<org.drools.guvnor.client.rpc.Module[]> cb);
    public void loadGlobalModule(AsyncCallback<org.drools.guvnor.client.rpc.Module> cb);
    public void createModule(java.lang.String p0, java.lang.String p1, String p2, AsyncCallback<Path> cb);
    public void createSubModule(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback<Path> cb);
    public void loadModule(Path p0, AsyncCallback<org.drools.guvnor.client.rpc.Module> cb);
    public void saveModule(org.drools.guvnor.client.rpc.Module p0, AsyncCallback cb);
    public void createModuleSnapshot(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, AsyncCallback cb);
    public void copyOrRemoveSnapshot(java.lang.String p0, java.lang.String p1, boolean p2, java.lang.String p3, AsyncCallback cb);
    public void buildPackage(Path p0, boolean p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, boolean p5, java.lang.String p6, java.lang.String p7, boolean p8, java.lang.String p9, AsyncCallback<org.drools.guvnor.client.rpc.BuilderResult> cb);
    public void buildModuleSource(Path p0, AsyncCallback<java.lang.String> cb);
    public void copyModule(java.lang.String p0, java.lang.String p1, AsyncCallback<Path> cb);
    public void removeModule(Path p0, AsyncCallback cb);
    public void renameModule(Path p0, java.lang.String p1, AsyncCallback<Path> cb);
    public void rebuildSnapshots(AsyncCallback cb);
    public void rebuildPackages(AsyncCallback cb);
    public void listRulesInPackage(java.lang.String p0, AsyncCallback<java.lang.String[]> cb);
    public void listImagesInModule(java.lang.String p0, AsyncCallback<java.lang.String[]> cb);
    public void listSnapshots(java.lang.String p0, AsyncCallback<org.drools.guvnor.client.rpc.SnapshotInfo[]> cb);
    public void listTypesInPackage(Path p0, AsyncCallback<java.lang.String[]> cb);
    public void installSampleRepository(AsyncCallback cb);
    public void compareSnapshots(java.lang.String p0, java.lang.String p1, java.lang.String p2, AsyncCallback<org.drools.guvnor.client.rpc.SnapshotDiffs> cb);
    public void compareSnapshots(org.drools.guvnor.client.rpc.SnapshotComparisonPageRequest p0, AsyncCallback<org.drools.guvnor.client.rpc.SnapshotComparisonPageResponse> cb);
    public void updateDependency(Path modulePath, String dependencyPath, AsyncCallback cb);
    public void getDependencies(Path modulePath, AsyncCallback<java.lang.String[]> cb);
    public void loadSnapshotInfo(String packageName, String snapshotName, AsyncCallback<SnapshotInfo> async);
    public void createModuleSnapshot(java.lang.String p0, java.lang.String p1,	boolean p2, java.lang.String p3, boolean p4, AsyncCallback cb);

}
