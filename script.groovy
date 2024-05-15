def builapp() {
    echo 'building the application'
}
def builapp() {
    echo 'Testing the application'
}
def builapp() {
    echo 'deploying the application'
    echo "deploying version ${params.VERSION}"
}

return this
