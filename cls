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
[32m+[m[32m          <property name="text" value="Label" />[m
[32m+[m[32m        </initial-values>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextField" icon="/com/intellij/uiDesigner/icons/textField.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JPasswordField" icon="/com/intellij/uiDesigner/icons/passwordField.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JFormattedTextField" icon="/com/intellij/uiDesigner/icons/formattedTextField.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1">[m
[32m+[m[32m          <preferred-size width="150" height="-1" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextArea" icon="/com/intellij/uiDesigner/icons/textArea.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTextPane" icon="/com/intellij/uiDesigner/icons/textPane.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JEditorPane" icon="/com/intellij/uiDesigner/icons/editorPane.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JComboBox" icon="/com/intellij/uiDesigner/icons/comboBox.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="2" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTable" icon="/com/intellij/uiDesigner/icons/table.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JList" icon="/com/intellij/uiDesigner/icons/list.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="2" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTree" icon="/com/intellij/uiDesigner/icons/tree.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="150" height="50" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JTabbedPane" icon="/com/intellij/uiDesigner/icons/tabbedPane.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="200" height="200" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSplitPane" icon="/com/intellij/uiDesigner/icons/splitPane.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="3" hsize-policy="3" anchor="0" fill="3">[m
[32m+[m[32m          <preferred-size width="200" height="200" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSpinner" icon="/com/intellij/uiDesigner/icons/spinner.png" removable="false" auto-create-binding="true" can-attach-label="true">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSlider" icon="/com/intellij/uiDesigner/icons/slider.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="8" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JSeparator" icon="/com/intellij/uiDesigner/icons/separator.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="6" anchor="0" fill="3" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JProgressBar" icon="/com/intellij/uiDesigner/icons/progressbar.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JToolBar" icon="/com/intellij/uiDesigner/icons/toolbar.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="6" anchor="0" fill="1">[m
[32m+[m[32m          <preferred-size width="-1" height="20" />[m
[32m+[m[32m        </default-constraints>[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JToolBar$Separator" icon="/com/intellij/uiDesigner/icons/toolbarSeparator.png" removable="false" auto-create-binding="false" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="0" hsize-policy="0" anchor="0" fill="1" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m      <item class="javax.swing.JScrollBar" icon="/com/intellij/uiDesigner/icons/scrollbar.png" removable="false" auto-create-binding="true" can-attach-label="false">[m
[32m+[m[32m        <default-constraints vsize-policy="6" hsize-policy="0" anchor="0" fill="2" />[m
[32m+[m[32m      </item>[m
[32m+[m[32m    </group>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/vcs.xml b/.idea/vcs.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..94a25f7[m
[1m--- /dev/null[m
[1m+++ b/.idea/vcs.xml[m
[36m@@ -0,0 +1,6 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="VcsDirectoryMappings">[m
[32m+[m[32m    <mapping directory="$PROJECT_DIR$" vcs="Git" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/configurations.properties b/configurations.properties[m
[1mnew file mode 100644[m
[1mindex 0000000..12ae2ea[m
[1m--- /dev/null[m
[1m+++ b/configurations.properties[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32mbrowser=chrome[m
\ No newline at end of file[m
[1mdiff --git a/pom.xml b/pom.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..4858860[m
[1m--- /dev/null[m
[1m+++ b/pom.xml[m
[36m@@ -0,0 +1,60 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project xmlns="http://maven.apache.org/POM/4.0.0"[m
[32m+[m[32m         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"[m
[32m+[m[32m         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">[m
[32m+[m[32m    <modelVersion>4.0.0</modelVersion>[m
[32m+[m
[32m+[m[32m    <groupId>org.example</groupId>[m
[32m+[m[32m    <artifactId>ConcortHotel</artifactId>[m
[32m+[m[32m    <version>1.0-SNAPSHOT</version>[m
[32m+[m
[32m+[m[32m    <properties>[m
[32m+[m[32m        <maven.compiler.source>11</maven.compiler.source>[m
[32m+[m[32m        <maven.compiler.target>11</maven.compiler.target>[m
[32m+[m[32m    </properties>[m
[32m+[m[32m    <dependencies>[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->[m
[32m+[m[32m        <dependency>[m
[32m+[m[32m            <groupId>org.seleniumhq.selenium</groupId>[m
[32m+[m[32m            <artifactId>selenium-java</artifactId>[m
[32m+[m[32m            <version>3.141.5</version>[m
[32m+[m[32m        </dependency>[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/org.testng/testng -->[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/org.testng/testng -->[m
[32m+[m[32m        <dependency>[m
[32m+[m[32m            <groupId>org.testng</groupId>[m
[32m+[m[32m            <artifactId>testng</artifactId>[m
[32m+[m[32m            <version>7.1.0</version>[m
[32m+[m[32m            <scope>test</scope>[m
[32m+[m[32m        </dependency>[m
[32m+[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->[m
[32m+[m[32m        <dependency>[m
[32m+[m[32m            <groupId>io.github.bonigarcia</groupId>[m
[32m+[m[32m            <artifactId>webdrivermanager</artifactId>[m
[32m+[m[32m            <version>4.4.3</version>[m
[32m+[m[32m        </dependency>[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/com.github.javafaker/javafaker -->[m
[32m+[m[32m        <dependency>[m
[32m+[m[32m            <groupId>com.github.javafaker</groupId>[m
[32m+[m[32m            <artifactId>javafaker</artifactId>[m
[32m+[m[32m            <version>1.0.2</version>[m
[32m+[m[32m        </dependency>[m
[32m+[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->[m
[32m+[m[32m        <dependency>[m
[32m+[m[32m            <groupId>org.apache.poi</groupId>[m
[32m+[m[32m            <artifactId>poi-ooxml</artifactId>[m
[32m+[m[32m            <version>4.1.2</version>[m
[32m+[m[32m        </dependency>[m
[32m+[m
[32m+[m[32m        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->[m
[32m+[m[32m        <dependency>[m
[32m+[m[32m            <groupId>org.apache.poi</groupId>[m
[32m+[m[32m            <artifactId>poi</artifactId>[m
[32m+[m[32m            <version>4.1.2</version>[m
[32m+[m[32m        </dependency>[m
[32m+[m
[32m+[m[32m    </dependencies>[m
[32m+[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/src/test/java/pages/ConcortHotelPage.java b/src/test/java/pages/ConcortHotelPage.java[m
[1mnew file mode 100644[m
[1mindex 0000000..80b0f39[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/pages/ConcortHotelPage.java[m
[36m@@ -0,0 +1,10 @@[m
[32m+[m[32mpackage pages;[m
[32m+[m
[32m+[m[32mimport org.openqa.selenium.support.PageFactory;[m
[32m+[m[32mimport utilitis.Driver;[m
[32m+[m
[32m+[m[32mpublic class ConcortHotelPage {[m
[32m+[m[32m   public ConcortHotelPage(){[m
[32m+[m[32m       PageFactory.initElements(Driver.getDriver(),this);[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/src/test/java/utilitis/ConfigReader.java b/src/test/java/utilitis/ConfigReader.java[m
[1mnew file mode 100644[m
[1mindex 0000000..fc9f292[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/utilitis/ConfigReader.java[m
[36m@@ -0,0 +1,26 @@[m
[32m+[m[32mpackage utilitis;[m
[32m+[m
[32m+[m[32mimport java.io.FileInputStream;[m
[32m+[m[32mimport java.io.IOException;[m
[32m+[m[32mimport java.util.Properties;[m
[32m+[m
[32m+[m[32mpublic class ConfigReader {[m
[32m+[m
[32m+[m[32m  private static Properties properties;[m
[32m+[m
[32m+[m[32m    static{[m
[32m+[m[32m        String path = "configurations.properties";[m
[32m+[m[32m        try {[m
[32m+[m[32m        FileInputStream fileInputStream = new FileInputStream(path);[m
[32m+[m[32m        properties = new Properties();[m
[32m+[m[32m            properties.load(fileInputStream);[m
[32m+[m[32m        } catch (IOException e) {[m
[32m+[m[32m            e.printStackTrace();[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public static String getProperty(String key){[m
[32m+[m
[32m+[m[32m        return properties.getProperty(key);[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[1mdiff --git a/src/test/java/utilitis/Driver.java b/src/test/java/utilitis/Driver.java[m
[1mnew file mode 100644[m
[1mindex 0000000..c07a69d[m
[1m--- /dev/null[m
[1m+++ b/src/test/java/utilitis/Driver.java[m
[36m@@ -0,0 +1,41 @@[m
[32m+[m[32mpackage utilitis;[m
[32m+[m
[32m+[m[32mimport io.github.bonigarcia.wdm.WebDriverManager;[m
[32m+[m[32mimport org.openqa.selenium.WebDriver;[m
[32m+[m[32mimport org.openqa.selenium.chrome.ChromeDriver;[m
[32m+[m[32mimport org.openqa.selenium.opera.OperaDriver;[m
[32m+[m
[32m+[m[32mimport java.util.concurrent.TimeUnit;[m
[32m+[m
[32m+[m[32mpublic class Driver {[m
[32m+[m[32m  private Driver(){}[m
[32m+[m[32m   private static WebDriver driver;[m
[32m+[m[32m   public static WebDriver getDriver(){[m
[32m+[m[32m      if(driver==null){[m
[32m+[m[32m         switch (ConfigReader.getProperty("browser")){[m
[32m+[m[32m            case "chrome":[m
[32m+[m[32m               WebDriverManager.chromedriver().setup();[m
[32m+[m[32m               driver = new ChromeDriver();[m
[32m+[m[32m               break;[m
[32m+[m[32m            case "opera":[m
[32m+[m[32m               WebDriverManager.operadriver().setup();[m
[32m+[m[32m               driver = new OperaDriver();[m
[32m+[m[32m               break;[m
[32m+[m[32m         }[m
[32m+[m
[32m+[m[32m      }[m
[32m+[m
[32m+[m[32m      driver.manage().window().maximize();[m
[32m+[m[32m      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);[m
[32m+[m[32m      return driver;[m
[32m+[m[32m   }[m
[32m+[m
[32m+[m[32m   public static void closeDriver(){[m
[32m+[m[32m      if(driver!=null){[m
[32m+[m[32m         driver.close();[m
[32m+[m[32m      }[m
[32m+[m[32m      driver=null;[m
[32m+[m[32m   }[m
[32m+[m
[32m+[m
[32m+[m[32m}[m
[1mdiff --git a/target/test-classes/pages/ConcortHotelPage.class b/target/test-classes/pages/ConcortHotelPage.class[m
[1mnew file mode 100644[m
[1mindex 0000000..d23f983[m
Binary files /dev/null and b/target/test-classes/pages/ConcortHotelPage.class differ
[1mdiff --git a/target/test-classes/tests/asdas.class b/target/test-classes/tests/asdas.class[m
[1mnew file mode 100644[m
[1mindex 0000000..a66b7ad[m
Binary files /dev/null and b/target/test-classes/tests/asdas.class differ
[1mdiff --git a/target/test-classes/utilitis/ConfigReader.class b/target/test-classes/utilitis/ConfigReader.class[m
[1mnew file mode 100644[m
[1mindex 0000000..494d16f[m
Binary files /dev/null and b/target/test-classes/utilitis/ConfigReader.class differ
[1mdiff --git a/target/test-classes/utilitis/Driver.class b/target/test-classes/utilitis/Driver.class[m
[1mnew file mode 100644[m
[1mindex 0000000..8cc14e4[m
Binary files /dev/null and b/target/test-classes/utilitis/Driver.class differ
