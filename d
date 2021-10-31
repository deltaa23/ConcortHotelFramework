[33mcommit b71035363d7e9b0ddfdac6bdfc34dc7a54f5e376[m
Author: yunus <eposta@site.com>
Date:   Thu Oct 28 13:34:17 2021 +0300

    framework

[1mdiff --git a/.idea/.gitignore b/.idea/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..26d3352[m
[1m--- /dev/null[m
[1m+++ b/.idea/.gitignore[m
[36m@@ -0,0 +1,3 @@[m
[32m+[m[32m# Default ignored files[m
[32m+[m[32m/shelf/[m
[32m+[m[32m/workspace.xml[m
[1mdiff --git a/.idea/compiler.xml b/.idea/compiler.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..32508b4[m
[1m--- /dev/null[m
[1m+++ b/.idea/compiler.xml[m
[36m@@ -0,0 +1,15 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="CompilerConfiguration">[m
[32m+[m[32m    <annotationProcessing>[m
[32m+[m[32m      <profile name="Maven default annotation processors profile" enabled="true">[m
[32m+[m[32m        <sourceOutputDir name="target/generated-sources/annotations" />[m
[32m+[m[32m        <sourceTestOutputDir name="target/generated-test-sources/test-annotations" />[m
[32m+[m[32m        <outputRelativeToContentRoot value="true" />[m
[32m+[m[32m        <module name="ccc" />[m
[32m+[m[32m        <module name="deneme" />[m
[32m+[m[32m        <module name="ConcortHotel" />[m
[32m+[m[32m      </profile>[m
[32m+[m[32m    </annotationProcessing>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/jarRepositories.xml b/.idea/jarRepositories.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..712ab9d[m
[1m--- /dev/null[m
[1m+++ b/.idea/jarRepositories.xml[m
[36m@@ -0,0 +1,20 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="RemoteRepositoriesConfiguration">[m
[32m+[m[32m    <remote-repository>[m
[32m+[m[32m      <option name="id" value="central" />[m
[32m+[m[32m      <option name="name" value="Central Repository" />[m
[32m+[m[32m      <option name="url" value="https://repo.maven.apache.org/maven2" />[m
[32m+[m[32m    </remote-repository>[m
[32m+[m[32m    <remote-repository>[m
[32m+[m[32m      <option name="id" value="central" />[m
[32m+[m[32m      <option name="name" value="Maven Central repository" />[m
[32m+[m[32m      <option name="url" value="https://repo1.maven.org/maven2" />[m
[32m+[m[32m    </remote-repository>[m
[32m+[m[32m    <remote-repository>[m
[32m+[m[32m      <option name="id" value="jboss.community" />[m
[32m+[m[32m      <option name="name" value="JBoss Community repository" />[m
[32m+[m[32m      <option name="url" value="https://repository.jboss.org/nexus/content/repositories/public/" />[m
[32m+[m[32m    </remote-repository>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..accd629[m
[1m--- /dev/null[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -0,0 +1,14 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="ExternalStorageConfigurationManager" enabled="true" />[m
[32m+[m[32m  <component name="MavenProjectsManager">[m
[32m+[m[32m    <option name="originalFiles">[m
[32m+[m[32m      <list>[m
[32m+[m[32m        <option value="$PROJECT_DIR$/pom.xml" />[m
[32m+[m[32m      </list>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectRootManager" version="2" languageLevel="JDK_11" default="true" project-jdk-name="11" project-jdk-type="JavaSDK">[m
[32m+[m[32m    <output url="file://$PROJECT_DIR$/out" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/runConfigurations.xml b/.idea/runConfigurations.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..797acea[m
[1m--- /dev/null[m
[1m+++ b/.idea/runConfigurations.xml[m
[36m@@ -0,0 +1,10 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="RunConfigurationProducerService">[m
[32m+[m[32m    <option name="ignoredProducers">[m
[32m+[m[32m      <set>[m
[32m+[m[32m        <option value="com.android.tools.idea.compose.preview.runconfiguration.ComposePreviewRunConfigurationProducer" />[m
[32m+[m[32m      </set>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/uiDesigner.xml b/.idea/uiDesigner.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..e96534f[m
[1m--- /dev/null[m
[1m+++ b/.idea/uiDesigner.xml[m
[36m@@ -0,0 +1,124 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="Palette2">[m
[32m+[m[32m    <group name="Swing">[m
[32m+[m[32m      <item class="com.intellij.uiDesigner.HSpacer" tooltip-text="Horizontal Spacer" icon="/com/intellij/uiDesigner/icons/hspacer.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="1" hsize-policy="6" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="com.intellij.uiDesigner.VSpacer" tooltip-text="Vertical Spacer" icon="/com/intellij/uiDesigner/icons/vspacer.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="1" anchor="0" fill="2" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JPanel" icon="/com/intellij/uiDesigner/icons/panel.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JScrollPane" icon="/com/intellij/uiDesigner/icons/scrollPane.png" removable="false" auto-create-binding="false" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="7" hsize-policy="7" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JButton" icon="/com/intellij/uiDesigner/icons/button.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="0" fill="1" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="Button" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JRadioButton" icon="/com/intellij/uiDesigner/icons/radioButton.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="RadioButton" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JCheckBox" icon="/com/intellij/uiDesigner/icons/checkBox.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="3" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" value="CheckBox" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JLabel" icon="/com/intellij/uiDesigner/icons/label.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="0" anchor="8" fill="0" />[m
[32m+[m[32m        <initial-values>[m
[32m+[m[32m          <property name="text" 