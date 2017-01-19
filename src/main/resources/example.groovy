def sharedData = new Binding()                          
def shell = new GroovyShell(sharedData)                 
def now = new Date()
sharedData.setProperty('text', 'I am shared data!')     
sharedData.setProperty('date', now)                     

String result = shell.evaluate(' "At $date, $text" ')