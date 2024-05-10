var mainIndex = new File(basedir, "target/classes/META-INF/sisu/javax.inject.Named")
var testIndex = new File(basedir, "target/test-classes/META-INF/sisu/javax.inject.Named")

assert mainIndex.exists()
assert mainIndex.text.contains('org.eclipse.sisu.mojos.Component')

assert testIndex.exists()
assert testIndex.text.contains('org.eclipse.sisu.mojos.ComponentTest')
